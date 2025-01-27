package com.Collection.Streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class TopFrequentWords {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>(List.of("Apple","Banana","Orange","kiwi","Apple","Orange","Orange"));
        Map<String,Long> freq=words.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));
        ArrayList<String> n=freq.entrySet().stream().sorted((x, y)->y.getValue().compareTo(x.getValue()))
                .map(Map.Entry::getKey).limit(3) .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(n);
    }
}
