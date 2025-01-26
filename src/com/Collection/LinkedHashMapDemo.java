package com.Collection;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>linkedHashMap= new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put(1,"Luffy");
        linkedHashMap.put(2,"Zoro");
        linkedHashMap.put(3,"Nami");
        linkedHashMap.get(1);
        linkedHashMap.put(4,"usoppu");
        linkedHashMap.put(5,"sanji");
        linkedHashMap.get(1);
        System.out.println(linkedHashMap);
        linkedHashMap.put(6,"Chopper");
        linkedHashMap.put(7,"Robin");
        linkedHashMap.put(8,"Franky");
        linkedHashMap.put(9,"Brook");
        linkedHashMap.put(10,"Jimbei");
        System.out.println(linkedHashMap);
        linkedHashMap.get(2);
        System.out.println(linkedHashMap);
        linkedHashMap.get(3);
        System.out.println(linkedHashMap);
        linkedHashMap.get(5);
        System.out.println(linkedHashMap);
        linkedHashMap.pollFirstEntry();
        System.out.println("polling"+linkedHashMap);


    }
}
