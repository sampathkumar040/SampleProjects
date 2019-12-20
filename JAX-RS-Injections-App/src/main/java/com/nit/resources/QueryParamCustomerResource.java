package com.nit.resources;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

@Path("/customer")
public class QueryParamCustomerResource {

	public QueryParamCustomerResource() {
		System.out.println("QueryParamCustomerResource::Constructor");
	}

	@GET
	@Path("/a")
	public String getCustomerName(@DefaultValue(value = "101") @QueryParam("cid") String customerId,
			@DefaultValue(value = "John") @QueryParam("name") String customerName) {
		System.out.println("getCustomerName() called");
		System.out.println("Customer ID :: " + customerId);
		System.out.println("Customer Name :: " + customerName);
		// logic
		return "Name :: John";
	}

	@GET
	@Path("/b")
	public String findByids(@Context UriInfo info) {
		System.out.println("** findByIds() called ** ");
		MultivaluedMap<String, String> map = info.getQueryParameters();
		List<String> ids = map.get("id");
		System.out.println(ids);
		return "Names :: John , Smith";
	}
}
