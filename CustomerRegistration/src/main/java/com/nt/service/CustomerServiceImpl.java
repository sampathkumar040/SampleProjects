package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO dao;
	
	public CustomerServiceImpl(CustomerDAO dao) {
System.out.println("CustomerServiceImpl::0-paramconstructor");
		this.dao = dao;
	}

	@Override
	public String register(CustomerDTO dto) {
		CustomerBO bo=null;
		int count=0;
		
		bo=new CustomerBO();
		BeanUtils.copyProperties(dto, bo);
		
		//ude dao
		count=dao.insert(bo);
		
		if(count==0)
			
			return "Registration Failed";
		else
			return "Registration Successful";
		

		
	}

}
