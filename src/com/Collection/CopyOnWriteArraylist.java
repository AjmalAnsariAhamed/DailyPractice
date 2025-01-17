package com.Collection;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArraylist {
    public static void main(String arg[]){
        CopyOnWriteArrayList<Integer> arrayList= new CopyOnWriteArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        for(Integer i:arrayList){
            if (i==4){
                arrayList.set(3,Integer.valueOf(44));
                arrayList.add(5);
                arrayList.add(6);
            }
            System.out.println(i);

        }
        System.out.println(arrayList);
    }
}
