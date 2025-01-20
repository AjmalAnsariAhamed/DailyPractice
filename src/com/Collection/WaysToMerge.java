package com.Collection;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WaysToMerge {
    public static void main (String args[]){
        //ArrayList<Integer> arrayList1= new ArrayList<>(IntStream.generate(()->1000).limit(1000).boxed().toList());
        //generate on value 1000 time
       // ArrayList<Integer>arrayList2= new ArrayList<>(Collections.nCopies(1000,2000));
        //generate 2000 1000 times
        ArrayList<Integer> arrayList1=new ArrayList<>(IntStream.rangeClosed(1,1000).boxed().toList());
        // this above line will generate 1 to 1000 elms in ArrayList
        List<Integer> arrayList2= new LinkedList<>(IntStream.rangeClosed(1001,2000).boxed().toList());


        //first way
        ArrayList<Integer> mergerList1=new ArrayList<>(arrayList1);
        // second way
        mergerList1.addAll(arrayList2);
        System.out.println(mergerList1);

        //Thi3d way using the Streams
        ArrayList<Integer> mergerList2=arrayList1.stream().collect(Collectors.toCollection(ArrayList::new));
        mergerList2.addAll(arrayList2.stream().toList());
        System.out.println(mergerList2);

    }
}
