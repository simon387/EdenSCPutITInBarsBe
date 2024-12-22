package it.simonecelia.edenSCputitinbarsBE.controller;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.dto.ReportDTO;
import it.simonecelia.edenSCputitinbarsBE.service.BarService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path ( "/bar" )
public class BarController {

	@Inject
	BarService barService;

	@POST
	@Produces ( MediaType.APPLICATION_JSON )
	public Response newBar ( ReportDTO report ) {
		Log.info ( "Calling newBar" );
		barService.newBar ( report );
		return Response.status ( Response.Status.CREATED ).build ();
	}
}
