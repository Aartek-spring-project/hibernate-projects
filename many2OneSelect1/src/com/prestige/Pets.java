package com.prestige;
public class Pets {

	private int petID;
	private String petCategory;
	private Owner parentObjects;
	public int getPetID() {
		return petID;
	}
	public void setPetID(int petID) {
		this.petID = petID;
	}
	public String getPetCategory() {
		return petCategory;
	}
	public void setPetCategory(String petCategory) {
		this.petCategory = petCategory;
	}
	public Owner getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Owner parentObjects) {
		this.parentObjects = parentObjects;
	}
	
}
