package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.CustomerBO;
import com.nt.service.CustomerService;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String INSERT_QUERY="INSERT INTO MVC_CUSTOMER VALUES(CNO_SEQ.NEXTVAL,?,?,?,?)";
	private JdbcTemplate jt;
	
	
	
	public CustomerDAOImpl(JdbcTemplate jt) {
		System.out.println("CustomerDAOImpl::0-paramconstructor");
		this.jt = jt;
	}

	@Override
	public int insert(CustomerBO bo) {
 int count=0;
 count=jt.update(INSERT_QUERY,bo.getCname(),bo.getAddrs(),bo.getMobileNo(),bo.getBillamt() );
 
		
		return count;
	}
	

}
