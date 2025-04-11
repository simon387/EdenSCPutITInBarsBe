package it.simonecelia.edenSCputitinbarsBE.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.service.BarService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.io.IOException;


@Path ( "/bar" )
public class BarController {

	@Inject
	BarService barService;

	@POST
	@Consumes ( MediaType.TEXT_PLAIN )
	@Produces ( MediaType.APPLICATION_JSON )
	public Response newBar (
					@QueryParam ( "realm" ) Realm realm,
					@QueryParam ( "character" ) String character,
					@QueryParam ( "gems" ) Integer gems,
					@QueryParam ( "user" ) String user,
					String payload ) throws IOException {
		Log.infof ( "Calling newBar, realm = %s, character = %s, gems = %d", realm, character, gems );
		barService.newBar ( realm, character, gems, user, payload );
		return Response.status ( Response.Status.CREATED ).build ();
	}
}
