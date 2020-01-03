package com.nt.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.CustomerCommand;
import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerService;

public class CustomerController extends SimpleFormController{
	private CustomerService service;

	public CustomerController(CustomerService service) {
		System.out.println("CustomerController::0-paramconstructor");
		this.service = service;
	}
	
	public ModelAndView onSubmit(HttpServletRequest req,HttpServletResponse res,Object command,
			BindException errors) throws Exception {
		System.out.println("CustomerInsertcontroller.onsubmit(-,-,-,-)");
		
		CustomerCommand cmd=null;
		CustomerDTO dto=null;
		String resultmsg=null;
		//type casting
			cmd=(CustomerCommand)command;
	//convert cmd to dto
			dto=new CustomerDTO();
			BeanUtils.copyProperties(cmd, dto);
			
			//use service
			resultmsg=service.register(dto);
			//create amd mav object
			return new ModelAndView(getSuccessView(),"msg",resultmsg);
			
	}


public ModelAndView handleInvalidsubmit(HttpServletRequest req,HttpServletResponse res)throws Exception{
	System.out.println("CustomerInsertController.handleInvalidsubmit()");
	return new ModelAndView("dbl_post");
}
	}

