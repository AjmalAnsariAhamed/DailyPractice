package com.Collection;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedHshSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer>linkedHashSet=new LinkedHashSet<>(16,0.75f);
                linkedHashSet.addAll(Stream
                        .iterate(1, x->x+1)
                        .limit(25).
                collect(Collectors
                        .toCollection(LinkedHashSet::new)));
        linkedHashSet.getFirst();

        System.out.println(linkedHashSet);

        System.out.println( linkedHashSet.stream().mapToInt(x->x.intValue()).sum());
        System.out.println( linkedHashSet.stream().collect(Collectors.partitioningBy(x-> x>(25/2))));
    }
}
