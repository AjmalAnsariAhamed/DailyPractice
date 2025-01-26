package com.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer>Q=new PriorityQueue<>(Comparator.reverseOrder());
        Q.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Q);

        PriorityQueue<Task>taskPriority=new PriorityQueue<>();
        taskPriority.offer(new Task("became pirate King",1));
        taskPriority.offer(new Task("kill kaido",5));
        taskPriority.offer(new Task("kill Loki",10));
        taskPriority.offer(new Task("meet shanks",1));


        System.out.println(taskPriority);

    }
}
class Task implements Comparable{
    String description;
    Integer priority;

    public Task(String description, Integer priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public int compareTo(Object o) {
        if(o==null){
            return 1;
        }
        Task other=(Task)o;
       return priority.compareTo(other.priority);
    }
    @Override
    public String toString(){
        return "["+description+"\t"+priority+"]";
    }
}
