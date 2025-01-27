package com.Collection.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteredEven {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=Stream.iterate(1,x->x+1).limit(50).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numbers);
        ArrayList<Integer>evenNumbers=new ArrayList<>( numbers.stream().filter(x->x%2==0).toList());
        System.out.println(evenNumbers);
        ArrayList<Integer>evenNumbers2ndway= Stream.iterate(1,x->x+1)
                .limit(100)
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(evenNumbers2ndway);

    }
}
