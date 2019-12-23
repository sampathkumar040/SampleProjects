package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import com.nt.commands.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;


public class StudentInsertController{
	private StudentInsertService service;

	public void setService(StudentInsertService service) {
		this.service = service;
	}
	
	protected  ModelAndView onSubmit(HttpServletRequest req,HttpServletResponse res,Object command,BindException errors)throws Exception{
	
		//type cast cmd obj
		StudentCommand cmd=(StudentCommand)command;
		
		//convert Command obj to DTO obj
		
		StudentDTO dto=new StudentDTO();
		
		dto.setSno(cmd.getSno());
		dto.setSname(cmd.getSname());
		dto.setSadd(cmd.getSadd());
		
		//use Service class
		String result=service.register(dto);
		//return ModelAndView obj
		return new ModelAndView(this.getSuccessView(),"resMsg",result);
		
	}

	private String getSuccessView() {
		return null;
	}

	

}
