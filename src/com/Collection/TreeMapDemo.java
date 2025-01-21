package com.Collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]){
        TreeMap<Integer,String> treeMap= new TreeMap<>();
        treeMap.put(1,"Luffy");
        treeMap.put(2,"zoro");
        treeMap.put(3,"Nmai");
        treeMap.put(4,"usopp");
        treeMap.put(5,"sanji");
        treeMap.put(6,"chopper");
        treeMap.put(7,"robin");
        treeMap.put(8,"Franky");
        treeMap.put(9,"Brook");
        treeMap.put(10,"Jimbei");
        for(Integer key:treeMap.keySet()){
            System.out.println(treeMap.get(key));
        }
        TreeMap<Integer,String> treeMap1= new TreeMap<>((x,y)->y-x);
        treeMap1.put(1,"Luffy");
        treeMap1.put(2,"zoro");
        treeMap1.put(3,"Nmai");
        treeMap1.put(4,"usopp");
        treeMap1.put(5,"sanji");
        treeMap1.put(6,"chopper");
        treeMap1.put(7,"robin");
        treeMap1.put(8,"Franky");
        treeMap1.put(9,"Brook");
        treeMap1.put(10,"Jimbei");
        for(Integer key:treeMap1.keySet()){
            System.out.println(treeMap.get(key));
        }
    }
}
