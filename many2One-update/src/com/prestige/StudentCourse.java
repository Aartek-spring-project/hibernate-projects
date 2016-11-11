package com.prestige;
import java.util.Set;

	public class StudentCourse {
	    private long course_id;
	    private String course_name; 
	    private int course_duration;
	    private Set<Student> student;
	     
	    public long getCourse_id() {
	        return course_id;
	    }
	    public void setCourse_id(long course_id) {
	        this.course_id = course_id;
	    }
	    public String getCourse_name() {
	        return course_name;
	    }
	    public void setCourse_name(String course_name) {
	        this.course_name = course_name;
	    }
	    public int getCourse_duration() {
	        return course_duration;
	    }
	    public void setCourse_duration(int course_duration) {
	        this.course_duration = course_duration;
	    }
	    public Set<Student> getStudent() {
	        return student;
	    }
	    public void setStudent(Set<Student> student) {
	        this.student = student;
	    }
	}