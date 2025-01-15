package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayList {
    public static void main(String args[]){
        ArrayList<String> str =new ArrayList(Arrays.asList("Nellore","Chennai","Bangalore","Pune","Bhopal","Delhi"));
        System.out.println(str);
        for (String city:str){
            if("Nellore".equals(city)){
                System.out.println("nellore has been found");
            }
        }
        //replacing the elements
        str.add("Bombay");
        str.add("Culcutta");
        System.out.println(str+"before");
        for(int i=0;i<str.size();i++){
            switch(str.get(i)){
                case "Culcutta": str.set(i,"Kolkata");
                break;
                case "Bombay":str.set(i,"Mumbai"); break;
                default:continue;
            }
        }
        System.out.println(str+"after");



    }

}
