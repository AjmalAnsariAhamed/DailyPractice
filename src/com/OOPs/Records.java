package com.OOPs;

public record Records(String name,int age) {
    public static void main(String[] args) {
        Records re= new Records("Luffy",19);
        System.out.println(re);
        //records can have main methods
        System.out.println(re.name());
        // while in class getters will be getName()
        // but here its just variable name

    }
}
