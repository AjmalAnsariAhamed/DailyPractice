package com.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(7);
        // 5,7
        list.add(7);
        list.add(5);
        //7,5
        list1.add(1,6);
        //5,6,7
        list.set(1,6);
        //7,6 it replaces


    }
}
