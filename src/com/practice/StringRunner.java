package com.practice;

public class StringRunner {
    private static String [] dayOfWeek =new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    public static String mostLength(){
        int maxCount=0;
        String day="";
        for (String days:dayOfWeek){
           if(maxCount<days.length()){
               maxCount=days.length();
               day=days;
           }
        }
        return day;
    }
    public static String[] reverseWeeks(){
        String [] weeks=new String[7];
        for (int i =dayOfWeek.length-1;i>=0;i--){
            System.out.println((dayOfWeek.length-1)-i+"  "+(dayOfWeek.length-1)+" i "+i);

            weeks[(dayOfWeek.length - 1) - i] = dayOfWeek[i];

        }
        return weeks;
    }
}
