package com;
// Generated Jul 11, 2016 4:54:51 PM by Hibernate Tools 3.4.0.CR1

/**
 * A1 generated by hbm2java
 */
public class A1 implements java.io.Serializable {

	private int id;
	private String country;

	public A1() {
	}

	public A1(int id) {
		this.id = id;
	}

	public A1(int id, String country) {
		this.id = id;
		this.country = country;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
