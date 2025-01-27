package com.Collection.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class StartsWithA {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>(Arrays.asList("Ajmal","Ansari","Ahamed","Shaziya","Hameeda"));
        System.out.println(names);
        names.stream().filter(x->x.toLowerCase().startsWith("a")).findFirst().stream().forEach(x-> System.out.println(x));
    }
}
