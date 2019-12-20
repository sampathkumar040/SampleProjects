package com.nit.model;

import javax.ws.rs.FormParam;

public class User {

	@FormParam("uname")
	private String uname;

	@FormParam("pwd")
	private String pwd;

	@FormParam("email")
	private String email;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", email=" + email + "]";
	}

}
