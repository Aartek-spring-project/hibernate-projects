package com.banking;

public class Customer {

	private Integer Customer_id;
	private String firstname;
	private String lastname;
	private Integer bankingId;
	public Integer getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		Customer_id = customer_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getBankingId() {
		return bankingId;
	}
	public void setBankingId(Integer bankingId) {
		this.bankingId = bankingId;
	}
	
	
	
	
}
