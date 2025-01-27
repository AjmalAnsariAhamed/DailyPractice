package com.Collection.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class PositiveOrNot {
    public static void main(String[] args) {
        // this program is to check whether the all numbers are positive or not
        ArrayList<Integer>numbers= new ArrayList<>(Arrays.asList(1,3,5,6,3,8,3,9,-6));
        System.out.println( numbers.stream().allMatch(x->x>0)==true?"All are positive Numbers":"negative numbers are also exist");
    }
}
