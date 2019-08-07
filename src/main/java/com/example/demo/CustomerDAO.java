package com.example.demo;

import javax.persistence.Column;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, String>{
	Customer findByEmailaddress(String emailaddress);
	Customer findBySoftware(String software);
	Customer findByOs(String os);
	Customer findByprobdes(String probdes);


}
