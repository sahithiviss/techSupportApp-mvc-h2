package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {
	
	
private String emailaddress;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long probnum;
public long getProbnum() {
	return probnum;
}

public void setProbnum(long probnum) {
	this.probnum = probnum;
}

private String software;
private String os;
private String probdes;


public String getSoftware() {
	return software;
}

public void setSoftware(String software) {
	this.software = software;
}

public String getOs() {
	return os;
}

public void setOs(String os) {
	this.os = os;
}

public String getProbdes() {
	return probdes;
}

public void setProbdes(String probdes) {
	this.probdes = probdes;
}

public String getEmailaddress() {
	return emailaddress;
}

public void setEmailaddress(String emailaddress) {
	this.emailaddress = emailaddress;
}

}
