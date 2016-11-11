package com.school;

import java.util.Set;

public class Teacher {

	private Integer teacher_id;
	private String subject;
	private Set teaching;
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Set getTeaching() {
		return teaching;
	}
	public void setTeaching(Set teaching) {
		this.teaching = teaching;
	} 

}
