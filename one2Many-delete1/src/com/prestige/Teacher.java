package com.prestige;

import java.util.Set;

public class Teacher {
	private Integer tid;
	private String t_name;
	private String subject_name;
	private int phone;
	private Set Selection;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Set getSelection() {
		return Selection;
	}
	public void setSelection(Set selection) {
		Selection = selection;
	}

}
