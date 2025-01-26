package com.Collection;

import org.w3c.dom.ls.LSOutput;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakReference<String>one=new WeakReference<>("One");
        WeakReference<String>two=new WeakReference<>("Two");
        WeakReference<String>three=new WeakReference<>("Three");
        WeakReference<String>four=new WeakReference<>("Four");
        WeakReference<String>five=new WeakReference<>("Five");
        WeakHashMap<WeakReference<String>,Integer> weak= new WeakHashMap<>();
        weak.putAll(Map.ofEntries( Map.entry(one,1),  Map.entry(two,2)
        ,Map.entry(three,3),
                Map.entry(four,4),
                Map.entry(five,5)));
        System.out.println(weak);
        one=null;
        //if it is in normal hashMap then hashMpa object will still reference
        //to "One" even we had pointed one variable to null
        // but
        // in the case of weakhashMap if original referenced var is pointing to different or null
        //then
        //jvm doesnt care if weakHashMap is holding reference or not it clears
        System.gc();
        System.gc();
        System.out.println(weak);

//        Map<String, String>weakH=new WeakHashMap<>();
//        weakH.put(null,null);
//        System.out.println(weakH);
//        weakH.put("hi",null);
//        System.out.println(weakH);
//        weakH.put(null,"hi");
//        System.out.println(weakH);
    }
}
