package com.nit.resources;

import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

@Path("/headerRes")
public class HeaderParamResource {

	@GET
	@Path("/a")
	public String getHeader(@HeaderParam("User-Agent") String userAgent, @HeaderParam("Accept") String accept) {
		System.out.println("getHeader() method called");
		System.out.println("User agent :: " + userAgent);
		return userAgent;
	}

	@GET
	@Path("/b")
	public String getHeaders(@Context HttpHeaders headers) {
		MultivaluedMap<String, String> map = headers.getRequestHeaders();
		Set<String> keys = map.keySet();
		for (String key : keys) {
			List<String> value = headers.getRequestHeader(key);
			System.out.println(key);
			System.out.println(value);
			System.out.println("---------------------");
		}

		return "Getting info";
	}
}
