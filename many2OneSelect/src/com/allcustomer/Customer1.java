package com.allcustomer;
public class Customer1 {

	private int customerId;
	private String customerName;
	private Vendor1 parentObjects;
	
	public Vendor1 getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Vendor1 parentObjects) {
		this.parentObjects = parentObjects;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}	
	
}
