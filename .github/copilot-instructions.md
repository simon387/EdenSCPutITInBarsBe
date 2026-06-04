# Copilot Instructions

## Project Overview

Backend service for the **Dark Age of Camelot** (Eden private server) spellcrafting tool. It parses gem text (copied from the game's spellcrafting UI) and writes hotbar entries directly into the game's INI configuration file, so players can quickly use crafted gems from their quickbar.

Java 21 + Quarkus 3.15.1, single REST endpoint, no database.

## Build & Run

```bash
# Dev mode (hot reload)
./mvnw quarkus:dev -Dquarkus.analytics.disabled=true

# Package
./mvnw package

# Native build
./mvnw package -Pnative
```

> The `quarkus.analytics.disabled=true` property in `application.properties` **does not work** — pass it as a JVM arg (`-D`) instead.

There are currently no unit tests. Integration tests run with `-DskipITs=false` (or via the `native` profile).

## HTTP Test Files

IntelliJ HTTP Client files are in `http_test/`. Use `http-client.env.json` for environment config (`local` → `localhost:8080/api/`). Example:

```
POST {{baseUrl}}bar?realm=HIBERNIA&user=Simon&character=Porcodio
Content-Type: text/plain

< payload.txt
```

## Architecture

```
BarController  →  BarService  →  GemService
                      ↓
              Writes to DAoC INI file
              (C:\Users\{user}\AppData\Roaming\Electronic Arts\
               Dark Age of Camelot\eden\{character}-41.ini)
```

- **`BarController`** – Single `POST /bar` endpoint. Accepts plain-text payload (gem list) + query params: `realm` (ALBION/HIBERNIA/MIDGARD), `character`, `gems` (expected count), `user` (Windows username for INI path).
- **`BarService`** – Orchestrates parsing → writing. Uses `ini4j` (`Wini`) to read/write the game INI. Writes gem hotkeys into `[Quickbar3]` starting at slot offset 20. If `enable.imbue.calc=true`, it groups gems by imbue weight (cap 40) and inserts spacers between groups.
- **`GemService`** – Parses multi-line plain text. For each line, checks if it contains a `GemStrength` keyword (raw → perfect), then identifies the gem name. Returns a list of `GemModel` instances.
- **`Gem` enum** – Maps every gem name to a `GemType` and a `baseId` integer. Name is derived from the enum constant: `BLOOD_ESSENCE_JEWEL` → `"blood essence jewel"`.
- **`GemStrength` enum** – Ten levels (RAW → PERFECT) each carrying numeric values for level offset, skill/stat/resist/hits imbue and actual stat values.
- **`GemModel`** – Computed model: `id = gem.baseId + strength.level`. Has realm-specific overrides for `BLOOD_ESSENCE_JEWEL` and `MYSTICAL_ESSENCE_JEWEL` (different base IDs per realm). Also calculates imbue weight per gem type.

## Key Conventions

- All endpoints are under the `/api` root path (set in `application.properties`).
- **Gem ID formula**: `gem.baseId + gemStrength.level` — `level` is 0–9 (RAW=0, PERFECT=9).
- **Realm-specific gem filtering**: `GemService` selects skill/focus arrays from `Gem.getByType(...)` based on realm. Each realm has distinct gem suffixes (Sigil=ALB, Rune=MID, Spell Stone=HIB).
- **Spacer gems**: A `GemModel` with id=0 (default constructor) represents a spacer slot written as `44,13` in the INI. Actual gem slots are written as `45,{id}`.
- **Default crafters** per realm are configured in `application.properties` (`default.alb.crafter`, `default.hib.crafter`, `default.mid.crafter`); used when `character` query param is omitted.
- **Imbue calculation** is toggled by `enable.imbue.calc` (default `false`). When enabled, gems are grouped so no piece exceeds imbue 40. When disabled, spacers are added every 4 gems if the total is divisible by 4.
- CORS is configured for `http://localhost:3000` (the companion frontend).
- Use `io.quarkus.logging.Log` (static) for all logging — not `java.util.logging` or SLF4J.
- CDI scopes: controllers are unscoped (JAX-RS default), services are `@ApplicationScoped`.

## Adding New Gems

Add entries to the `Gem` enum with the appropriate `GemType` and `baseId`. The gem name for text matching is auto-derived from the enum constant name (underscores → spaces, lowercased). If a gem has no known ID (focus gems, some skills), use `null` as `baseId` — but `GemModel.calcId()` will throw at runtime, so only add `null` IDs for gem types that are never resolved to a `GemModel` (e.g., pure focus gems listed for matching purposes only).
