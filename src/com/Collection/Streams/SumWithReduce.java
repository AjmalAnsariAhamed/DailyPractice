package com.Collection.Streams;

import java.util.ArrayList;
import java.util.List;

public class SumWithReduce {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>(List.of(1,5,7,4,0,20,30));
        numbers.stream().reduce((x,y)->x+y).stream().forEach(x-> System.out.println(x));
    }
}
