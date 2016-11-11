package com.prestige;

public class Student {
	 
    private long student_id;
    private String student_roll_no;
    private StudentCourse studentCourse;
     
    public long getStudent_id() {
        return student_id;
    }
 
    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }
 
    public String getStudent_roll_no() {
        return student_roll_no;
    }
 
    public void setStudent_roll_no(String student_roll_no) {
        this.student_roll_no = student_roll_no;
    }
 
    public StudentCourse getStudentCourse() {
        return studentCourse;
    }
 
    public void setStudentCourse(StudentCourse studentCourse) {
        this.studentCourse = studentCourse;
    }
}