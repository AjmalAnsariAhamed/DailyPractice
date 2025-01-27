package com.Collection.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStrings {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(List.of("Aarif","Ajmal","Ansari","Ahamed","Kumail","Abbas","Salman","Khan","Zaid"));
        System.out.println(list);
        HashMap<Integer,List<String>> map=list
                .stream()
                .collect(Collectors.groupingBy(String::length
                        ,HashMap::new
                        ,Collectors.toList()));
                        // Collectors.toList determines that the values for corresponding
                        // keys shall be type pf list

    }
}
