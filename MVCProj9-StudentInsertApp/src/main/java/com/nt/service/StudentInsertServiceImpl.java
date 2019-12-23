package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {
	private StudentInsertDAO dao;

	public void setDao(StudentInsertDAO dao) {
		this.dao = dao;
	}

	public String register(StudentDTO dto) {
		//convert DTO obj to BO obj
		StudentBO bo=new StudentBO();
		
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		
		//use DAO
		int cnt=dao.insert(bo);
		if(cnt==0)
			return "Student Register Failed";
		else
			return "Student Register Successful with no"+bo.getSno(); 
		
		
		
		
	}

}
