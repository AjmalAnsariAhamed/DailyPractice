package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class VectorVsArrayList {
    public static void main(String arg[]){
        int [] array=new int[2000];
        ArrayList<Integer> arrayList=new ArrayList<>();
        Vector<Integer> vector= new Vector<>();
        Thread thread1=new Thread(()->{
            for (int i=1;i<1001;i++){
                arrayList.add(Integer.valueOf(i));
                vector.add(Integer.valueOf(i));
                array[i]=i;

            }
        });


        Thread thread2=new Thread(()->{
            for (int i=1001;i<2000;i++){
                arrayList.add(Integer.valueOf(i));
                vector.add(Integer.valueOf(i));
                array[i]=i;

            }
        });

        thread1.start();
        thread2.start();
        long arraySize= Arrays.stream(array).filter(x->x!=0).count();
       System.out.println(arraySize+"\t Array");
//        System.out.println(arrayList+"\t Array \t"+arrayList.size()+1);
//        System.out.println(vector+"\t Vector \t"+vector.size()+1);
        //ArrayList will never have the sie of 2000 sam with the Array
        System.out.println(arrayList.size()+1+"\t ArrayList");
        //vector will always have the 2000 of size
        System.out.println(vector.size()+1+"\t Vector");

    }
}
