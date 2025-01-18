package com.jsp.springmvc.studentdb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String studentEmail;
    private int studentAge;
    private int studentMarks;

    // Getter and Setter methods
    public int getStudentId() {
        return studentId;
    }

   
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }
}
