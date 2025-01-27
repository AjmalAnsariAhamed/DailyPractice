package com.Collection.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class OccurrenceOfString {
    public static void main(String[] args) {
        ArrayList<String>words= new ArrayList<>(Arrays.asList("he","is","the","main","hero","of","konoha"));
        System.out.println(  words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(  words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));

    }
}
