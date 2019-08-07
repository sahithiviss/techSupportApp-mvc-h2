package com.example.demo;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//pradeep.kumar44@gmail.com

@Controller
public class MyController {
	Boolean status=true;
	@Autowired
	CustomerDAO dao1;
	@Autowired
    DetailsDAO dao;
	@Autowired
	JdbcTemplate jdbc;
	@RequestMapping("/add")
	public String register(Customer customer,@RequestParam("emailaddress")String email) {
		dao1.save(customer);
		if(dao.existsById(email)) {
			return "acknowledge.html";
		}
		status=false;
		return "customerRegistration.html";
	
	}
	
	@RequestMapping("/register")
	public String insert(customerDetails customer) {
		dao.save(customer);
		return "acknowledge.html";
	}
	

	
	
}
