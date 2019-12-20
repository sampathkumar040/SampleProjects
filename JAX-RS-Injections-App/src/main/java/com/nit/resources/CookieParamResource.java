package com.nit.resources;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/cookie")
public class CookieParamResource {

	@GET
	@Path("/write")
	public Response writeCookies() {
		System.out.println("writeCookies() called");
		
		String msg = "Cookies Added To Browser";

		// Create Cookie objects
		NewCookie c1 = new NewCookie("uname", "john");
		NewCookie c2 = new NewCookie("email", "john@gmail.com");

		ResponseBuilder rb = Response.ok(msg);

		rb.cookie(c1, c2);

		Response response = rb.build();

		return response;
	}

	@GET
	@Path("/read")
	public String readCookies(@CookieParam("uname") String name, @CookieParam("email") String mail) {
		System.out.println("readCookies() called");
		
		System.out.println("Uname :: " + name);
		System.out.println("Email :: " + mail);
		
		return "Getting Cookies Info";
	}

}
