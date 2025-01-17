package com.Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LrcCacheLinkedHashMap<K,V> extends LinkedHashMap<K ,V>{
    private int capacity;

    LrcCacheLinkedHashMap(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }
    public static void main(String arg[]){
        LrcCacheLinkedHashMap<String,Integer> cache =new LrcCacheLinkedHashMap<>(5);
        cache.put("one",1);
        cache.put("two",2);
        cache.put("three",3);
        cache.put("four",4);
        cache.put("five",5);
        cache.put("six",6);
        System.out.println(cache);
    }
}
