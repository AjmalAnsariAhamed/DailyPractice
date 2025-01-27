package com.Collection.Streams;

import java.util.ArrayList;
import java.util.List;

public class FlattenList {
    public static void main(String[] args) {
        ArrayList<List<String>> layeredList= new ArrayList<>(List.of(List.of("Hello","hi"),List.of("byr")));
        System.out.println(layeredList);
        List<String> list=layeredList.stream().flatMap(List::stream).toList();
        System.out.println(list);

    }
}
