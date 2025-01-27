package com.Collection.Streams;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class LongestString {
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<>(Arrays.asList("Ajmal","Ansari","Ahamed","Kumail","salman khan"));
      Optional<String> maxWord=  words.stream().max((s1, s2)->s1.compareTo(s2));
        System.out.println(maxWord.get());
    }
}
