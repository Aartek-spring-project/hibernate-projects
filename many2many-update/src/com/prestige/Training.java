package com.prestige;

import java.util.Set;

public class Training {
    private int training_id;
    private String training_name;
    private Set<Student> student;
     
    public int getTraining_id() {
        return training_id;
    }
    public void setTraining_id(int training_id) {
        this.training_id = training_id;
    }
    public String getTraining_name() {
        return training_name;
    }
    public void setTraining_name(String training_name) {
        this.training_name = training_name;
    }
    public Set<Student> getStudent() {
        return student;
    }
    public void setStudent(Set<Student> student) {
        this.student = student;
    }
}