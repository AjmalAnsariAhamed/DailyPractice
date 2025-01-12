package com.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.OptionalInt;

public class Student {
    private String name;
    private int [] listOfMarks;
   public Student(String name,int [] listOfMarks){
        this.name=name;
        this.listOfMarks=listOfMarks;

    }
    public int getTotalSumOfMarks(){
       return Arrays.stream(listOfMarks).sum();
    }
    public int maximumMarks(){
        OptionalInt max= Arrays.stream(listOfMarks).max();
        return max.getAsInt();
    }
    public int MinimumMarks(){
        OptionalInt min = Arrays.stream(listOfMarks).min();
        return min.getAsInt();
    }
    public BigDecimal averageMarks(){
        return new BigDecimal(getTotalSumOfMarks()).divide(  new BigDecimal(listOfMarks.length), RoundingMode.UP   );

    }
}
