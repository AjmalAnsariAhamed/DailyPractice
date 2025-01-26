package com.Collection;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsComparison {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap= Stream.iterate(1,x->x+1)
                .limit(1000000)
                .collect(Collectors
                        .toMap(x -> x,
                                y-> 1000000-y.intValue(),
                        (existing,replacement)->existing,
                        HashMap::new));

        TreeMap<Integer,Integer>treeMap=Stream.iterate(1,x -> x+1)
                .limit(1000000)
                .collect(Collectors
                        .toMap(x->x,
                                y-> 1000000-y.intValue(),
                                (x,y)->x,
                                TreeMap::new)
                );

        LinkedHashMap<Integer,Integer> linkedHashMap= Stream.iterate(1,x->x+1).limit(1000000)
                .collect(Collectors.toMap(x->x,
                        y->1000000-y.intValue(),
                        (x,y)->y,
                        LinkedHashMap::new));

        ConcurrentHashMap<Integer,Integer> concurrentHashMap= Stream.iterate(1, x->x+1).limit(1000000)
                .collect(Collectors.toMap(x->x,
                        y->1000000-y.intValue(),
                        (x,y)->y,
                        ConcurrentHashMap::new));
        System.out.println("ello orld");

       Long hashMapInsertingTime= System.currentTimeMillis();
        for(Map.Entry entry: hashMap.entrySet()){
            System.out.println(entry.getValue());
        };
        Long hashMapInsertingTimeEnd= System.currentTimeMillis();
        System.out.println("\n \n \n");
        System.out.println(hashMapInsertingTimeEnd-hashMapInsertingTime+"\tDuration");
        System.out.println("\n \n \n");

        //Hash map 1348

        Long treeMapInsertingTime= System.currentTimeMillis();
        for(Map.Entry entry: treeMap.entrySet()){
            System.out.println(entry.getValue());
        };
        Long treeMapInsertingTimeEnd= System.currentTimeMillis();
        System.out.println(treeMapInsertingTimeEnd-treeMapInsertingTime+"\tDuration of tree and Duration of hashMap is"+(hashMapInsertingTimeEnd-hashMapInsertingTime));
        Long rndmH =System.currentTimeMillis();
        hashMap.get(100);
        Long rndmHEnd =System.currentTimeMillis();
        Long rndmM =System.currentTimeMillis();
        treeMap.get(100);
        Long rndmMEnd =System.currentTimeMillis();
        System.out.println(rndmH-rndmHEnd+"tree\t h :\t"+(rndmMEnd-rndmM));




    }

}
