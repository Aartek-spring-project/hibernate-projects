package com.address;

import java.util.Set;

public class Addresses {
    private int aid;
    private String address_line;
    private String city;
    private String country;
    private String pincode;
    
    private Set<People> people;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAddress_line() {
		return address_line;
	}

	public void setAddress_line(String address_line) {
		this.address_line = address_line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Set<People> getPeople() {
		return people;
	}

	public void setPeople(Set<People> people) {
		this.people = people;
	}
	
}