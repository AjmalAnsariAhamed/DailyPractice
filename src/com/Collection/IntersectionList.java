package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IntersectionList {
    public static void main(String args []){
        ArrayList<Integer> list1=new ArrayList<>(List.of(1,2,4,6,8,10));
        ArrayList<Integer>list2= new ArrayList<>(Arrays.asList(1,4,7,10,5));
        LinkedList<Integer> lList=new LinkedList<>();
        for(Integer i:list1){
            if(list2.contains(i)){
                lList.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(lList);



    }
}
