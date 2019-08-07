package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DetailsDAO extends CrudRepository<customerDetails, String>{
	customerDetails findByEmailaddress(String emailaddress);
	customerDetails findByfirstname(String firstname);
	customerDetails findBylastname(String lastname);
	customerDetails findByphoneno(String phoneno);
}
