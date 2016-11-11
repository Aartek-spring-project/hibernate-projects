package com.training;

import java.util.Set;

public class Training {
 
	private int tId;
	private String tName;
	private String tSubject;
	private Set<Course_t> courses;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettSubject() {
		return tSubject;
	}
	public void settSubject(String tSubject) {
		this.tSubject = tSubject;
	}
	public Set getCourses() {
		return courses;
	}
	public void setCourses(Set courses) {
		this.courses = courses;
	}
    
 
}