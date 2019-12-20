package com.nit.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/book")
public class PathParamBookResource {
	public PathParamBookResource() {
		System.out.println("PathParamBookResource::Constructor");
	}

	@GET
	@Path("{isbn}")
	public String getBookPrice(@PathParam("isbn") String isbn) {
		System.out.println("getBookPrice() called");
		System.out.println("ISBN :: " + isbn.trim());
		return "Price :: $450.00";
	}

	@GET
	@Path("{isbn}/{name}")
	public String getPrice(@PathParam("isbn") String isbn, @PathParam("name") String name) {
		System.out.println("getBookPrice() called");
		System.out.println("ISBN :: " + isbn);
		System.out.println("Name :: " + name);
		return "Price :: $350.00";
	}
}
