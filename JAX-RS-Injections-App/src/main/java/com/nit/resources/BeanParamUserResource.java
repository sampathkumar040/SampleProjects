package com.nit.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.nit.model.User;

@Path("/user")
public class BeanParamUserResource {

	public BeanParamUserResource() {
		System.out.println("BeanParamUserResource::Constructor");
	}

	@POST
	@Path("/addUser")
	public String addUser(@BeanParam User user) {
		System.out.println("addUser()  called");

		System.out.println(user);

		return "Added";
	}

}
