package com.OOPs;

public class Student extends Person{
    private int studentId;
    private int year;
    private String college;
    private int grade;

    public Student(int studentId, int year, int grade,String college) {
//super( phoneNumber,name,email,address);
        this.studentId = studentId;
        this.year = year;
        this.college = college;
        this.grade=grade;
    }
    public Student(String name,int studentId, int year,int grade, String college,int phoneNumber,String email,String address) {
super( phoneNumber,name,email,address);
        this.studentId = studentId;
        this.year = year;
        this.college = college;
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String Dupeshot(String m, int i, int s) {
        System.out.println(s+" Child "+m);
        return m;
    }

    @Override
    public String toString() {
        return "Student "+"name["+super.getName()+"]"
                +"email["+super.getEmail()+"]"
                +"Student{"
                +"grade :" +this.grade+
                "  studentId=" + studentId +
                ", year=" + year +
                ", college='" + college + '\'' +
                '}'+'\n';
    }
}
