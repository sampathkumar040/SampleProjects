package com.nit.resources;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/car")
public class MatrixParamCarResource {

	@Produces(MediaType.TEXT_PLAIN)
	@GET
	@Path("/check/{model}/{year}")
	public String checkCarAvailability(
			@PathParam("model") String model, 
			@PathParam("year") String year, 
			@MatrixParam("color") String color)
	{

		System.out.println("Model :: " + model);
		System.out.println("Year :: " + year);
		System.out.println("Color :: " + color);

		return "Available";
	}

}
