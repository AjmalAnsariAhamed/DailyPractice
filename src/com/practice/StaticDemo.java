package com.practice;

public class StaticDemo {
    static int count;
    int value;
     public static int getCount(){
        // value; in static methods no instance variable
         return count;

     }

    public int getValue() {

        return value+count;
    }

}
