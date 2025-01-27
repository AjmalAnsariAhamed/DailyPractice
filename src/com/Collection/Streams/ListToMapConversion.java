package com.Collection.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(List.of("Apple","Orange","Kiwi"));
        System.out.println(list);
        HashMap<Integer,String>fromList=list.stream().collect(Collectors.toMap(x->x.length(),y->y,(x,y)->x,HashMap::new));
        System.out.println(fromList);
        HashMap<Integer,String>map=new HashMap<>(Map.ofEntries(Map.entry(1,"one"),Map.entry(2,"Two"),Map.entry(3,"Three")));
        System.out.println(map);
        ArrayList<String>fromMap=map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(fromMap);
    }
}
