package com.address;

import java.util.Set;

public class People {

   private int pid;
   private String fname;
   private String lname;
   private Set<Addresses> pe_address;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public Set<Addresses> getPe_address() {
	return pe_address;
}
public void setPe_address(Set<Addresses> pe_address) {
	this.pe_address = pe_address;
}
   
}