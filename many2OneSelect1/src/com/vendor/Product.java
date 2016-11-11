package com.vendor;
public class Product {

	private int pId;
	private String pName;
	private Integer price;
	private Supplier parentObjects;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Supplier getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Supplier parentObjects) {
		this.parentObjects = parentObjects;
	}
	
	
	
}
