package com.OOPs;

public class Student extends Person{
    private int studentId;
    private int year;
    private String college;

    public Student(int studentId, int year, String college,int phoneNumber,String name,String email,String address) {
super( phoneNumber,name,email,address);
        this.studentId = studentId;
        this.year = year;
        this.college = college;
    }
}
