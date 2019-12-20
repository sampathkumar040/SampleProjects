package com.nit.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/student")
public class FormParamStudentResource {

	public FormParamStudentResource() {
		System.out.println("FormParamStudentResource::Constructor");
	}

	@POST
	@Path("/addStudent")
	public String registerStudent(@FormParam("uname") String uname, @FormParam("pwd") String pwd,
			@FormParam("email") String email) {

		System.out.println("registerStudent() called");

		System.out.println("Username : " + uname);
		System.out.println("Password : " + pwd);
		System.out.println("Email : " + email);

		System.out.println("-----------------------------");
		return "Registration Completed";
	}

}
