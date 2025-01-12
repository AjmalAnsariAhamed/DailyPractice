package com.OOPs;

public class Student extends Person{
    private int studentId;
    private int year;
    private String college;

    public Student(int studentId, int year, String college) {

        this.studentId = studentId;
        this.year = year;
        this.college = college;
    }
}
