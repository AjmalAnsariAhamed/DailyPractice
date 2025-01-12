package com.OOPs;

public class Person {
    private int phoneNumber;
    private String email;
    private String name;
    private String address;

    Person(){

    }


    Person(int phoneNumber,String name,String email,String address){
        System.out.println("Person is called");
        this.address=address;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
