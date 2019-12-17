package com.nit.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/welcome")
public class WelcomeResource {

	public WelcomeResource() {
		System.out.println("WelcomeResource::Constructor");
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getWelcomeMsg() {
		System.out.println("getWelcomeMsg() called");
		String msg = "<h1>Welcome to JAX-RS with RestEasy..!!";
		return Response.ok(msg).build();
	}
}
