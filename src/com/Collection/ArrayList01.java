package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 {
    public static void main(String args[]){
        // asList returns implementation of List called ArrayList which is inside of
        // Arrays class java.util.Arrays$ArrayList not java.util.ArrayList
        //java.util.Arrays$ArrayList != java.util.ArrayList
        List<Integer> list = Arrays.asList(1,2,3,4);
        ArrayList<Integer> arraysList=Arrays.asList(1,2,3);//error
        //no add and remove only set will work

        //List.of
        List<Integer>list1= List.of(1,2,3);
        ArrayList<Integer> listOfList=List.of(1,2,3);//error
        // cant add, set and remove

        // the bestway
        List<Integer> egList=Arrays.asList(1,2,3);
        ArrayList<Integer> egArrList = new ArrayList<>(egList);
        // or in simple
        ArrayList<Integer> egArrList1=new ArrayList<>(Arrays.asList(1,2,3,4));



    }
}
