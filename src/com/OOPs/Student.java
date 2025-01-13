package com.OOPs;

public class Student extends Person{
    private int studentId;
    private int year;
    private String college;

    public Student(int studentId, int year, String college) {
//super( phoneNumber,name,email,address);
        this.studentId = studentId;
        this.year = year;
        this.college = college;
    }


    public String Dupeshot(String m, int i,int s) {
        System.out.println(s+" Child "+m);
        return m;
    }

}
