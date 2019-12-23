package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentInsertDAOImpl implements StudentInsertDAO{
private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT VALUES(?,?,?)";

private JdbcTemplate jt;

	public StudentInsertDAOImpl(JdbcTemplate jt) {
System.out.println("StudentInsertDAOImpl:1-paramconstructor");
		this.jt= jt;
}


public int insert(StudentBO bo) {
		int cnt=jt.update(INSERT_STUDENT_QUERY,bo.getSno(),bo.getSname(),bo.getSadd());
		return cnt;
	}

	
}
