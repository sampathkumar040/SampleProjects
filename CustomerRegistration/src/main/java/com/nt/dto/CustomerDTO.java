package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable{

	
	private String cname;
	private String addrs;
	private long mobileNo;
	private float billamt;
}
