package com.project;

import java.util.Date;
import java.util.Set;

public class Project {

   private long pId;
   private String projectName;
   private Date date;
   private Set<Employee> employee;
   public long getpId() {
	return pId;
 }
  public void setpId(long pId) {
	this.pId = pId;
}
   public String getProjectName() {
	return projectName;
}
   public void setProjectName(String projectName) {
	this.projectName = projectName;
}
   public Date getDate() {
	return date;
}
   public void setDate(Date date) {
	this.date = date;
}
    public Set<Employee> getEmployee() {
	return employee;
}
    public void setEmployee(Set<Employee> employee) {
	this.employee = employee;
}
    
   
}