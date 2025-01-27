package com.Collection.Streams;

import java.util.ArrayList;
import java.util.List;

public class StringSorting {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(List.of("Aarif","Ajmal","Ansari","Ahamed","Kumail","Abbas","Salman","Khan","Zaid"));
        System.out.println(list);
        list.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(x-> System.out.println(x));

    }
}
