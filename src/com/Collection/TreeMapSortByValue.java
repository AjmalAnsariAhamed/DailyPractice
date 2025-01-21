package com.Collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortByValue {
    public static void main(String[] args) {
        TreeMap<String,Integer> unsortedMap=new TreeMap<>();
        unsortedMap.put("a", 10);
        unsortedMap.put("b", 5);
        unsortedMap.put("c", 20);
        unsortedMap.put("d", 15);
        Comparator<String>customComparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer one =unsortedMap.get(o1);
                Integer two =unsortedMap.get(o2);

                return two-one;
            }
        };
        Map<String,Integer> sortedMap=new TreeMap<>(customComparator);
        sortedMap.putAll(unsortedMap);
        System.out.println(unsortedMap);
        System.out.println(sortedMap);

    }
}
