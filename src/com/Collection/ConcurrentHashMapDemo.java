package com.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> num=new ArrayList<>(Arrays.asList("one","two","three","four","five","six","seven","eight","nine",
                "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"));

        Map<Integer, String> map = new ConcurrentHashMap<>(16,0.75f);
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"thre");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seveen");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(10,"ten");
        map.put(11,"eleven");
        map.put(12,"twelve");
        map.put(13,"thirtee");
        map.put(14,"fourteen");
        map.put(15,"fifteen");
        map.put(16,"sixteen");
        map.put(17,"seventeen");
        map.put(18,"eighhteen");
        map.put(19,"nineteen");
        map.put(20,"twenty");

        Thread update=new Thread(()->{
            System.out.println("updating the thread b/w 1 to 10");
            for(int i=0;i<10;i++){
                System.out.println("thread 1");
               if(!map.get(i+1).equals(num.get(i))){
                  map.put(i,num.get(i));
               }
            }
            System.out.println("update thread has completed its work");
        });
        Thread update2=new Thread(()->{
            System.out.println("updating the thread b/w 11 to 20");
            for(int i=11;i<20;i++){
                System.out.println("thread 2");
                if(!map.get(i).equals(num.get(i))){
                    map.put(i,num.get(i));
                }
            }
            System.out.println("update2 thread has completed its work");
        });
        Thread read=new Thread(()->{
            System.out.println("read thread");
            for(Map.Entry entry:map.entrySet()){
                System.out.println("thread 3");
                System.out.println("key : "+entry.getKey()+", value : "+entry.getValue());
            }
            System.out.println("read thread completed");
        });
        update.start();
        System.out.println("main thread is running");
        update2.start();
        read.start();

        update.join();
        update2.join();
        read.join();
        System.out.println("all thread hae completed their work");
        System.out.println(map);






    }
}
