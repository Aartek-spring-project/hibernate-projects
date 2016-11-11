package com.project;

import java.util.Set;

public class Employee {
    private int empId;
    private String fName;
    private String lName;
    private Set<Project> project;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Set<Project> getProject() {
		return project;
	}
	public void setProject(Set<Project> project) {
		this.project = project;
	}
     
   
}