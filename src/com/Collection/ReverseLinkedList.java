package com.Collection;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String args[]){
        LinkedList<Integer> linkedList= new LinkedList<>(List.of(1,2,3,4,5));
        LinkedList<Integer> reversedLinkedList=new LinkedList<>();
        while(!linkedList.isEmpty()){
            reversedLinkedList.offer(linkedList.pollLast());
        }

        System.out.println(reversedLinkedList);
    }
}
