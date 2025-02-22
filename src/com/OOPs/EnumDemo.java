package com.OOPs;


import java.sql.SQLOutput;

public class EnumDemo {
  public static enum days{MONDAY,TUESDAY,WEDNESDAY};

    public static void main(String[] args) {
        System.out.printf("%s and %d",days.MONDAY,days.MONDAY.ordinal()).println();
        //ordinal returns the index
        System.out.println(days.valueOf("MONDAY"));
        // valueOf returns values of given String

    }
}
