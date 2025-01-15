package com.Collection;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVLinkedList {
    public static void main(String arg[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList= new ArrayList<>();
        Instant assigning=Instant.now();
        for (int i=0;i<=1000000;i++){
            arrayList.add(Integer.valueOf(i));
            linkedList.add(Integer.valueOf(i));
        }
        Instant afterAssigning=Instant.now();
        System.out.println(Duration.between(afterAssigning,assigning));
        Instant addingAtFirstInArr =Instant.now();
        arrayList.add(1000001,700);
        Instant afterAddingAtFirstInArr=Instant.now();
        Duration durationOfArrAdding=Duration.between(addingAtFirstInArr,afterAddingAtFirstInArr);

        Instant addingAtFirstInLl=Instant.now();
linkedList.add(1000001,700);
        Instant afterAddingAtFirstInLl=Instant.now();
        Duration durationOfLlAdding=Duration.between(addingAtFirstInLl,afterAddingAtFirstInLl);


        if (durationOfLlAdding.compareTo(durationOfArrAdding) > 0) {
            System.out.println("LinkedList operation took longer. for Adding index last");
        } else if (durationOfLlAdding.compareTo(durationOfArrAdding) < 0) {
            System.out.println("ArrayList operation took longer. for adding index last");
        } else {
            System.out.println("Both operations took the same duration. Adding index last");
        }


        //insertion at middle

        Instant insertionAtMiddleOfArr=Instant.now();
        arrayList.add(500100,700);
        Instant afterInsertionAtMiddleOfArr=Instant.now();
        Duration durationOfInsertionAtMidArr=Duration.between(insertionAtMiddleOfArr,afterInsertionAtMiddleOfArr);

        Instant insertionAtMiddleOfLl=Instant.now();
        linkedList.add(500100,700);
        Instant afterInsertionAtMiddleOfLl=Instant.now();
        Duration durationOfInsertionAtMidLl=Duration.between(insertionAtMiddleOfLl,afterInsertionAtMiddleOfLl);

        if (durationOfInsertionAtMidLl.compareTo(durationOfInsertionAtMidArr) > 0) {
            System.out.println("Insertion LinkedList operation took longer.");
        } else if (durationOfInsertionAtMidLl.compareTo(durationOfInsertionAtMidArr) < 0) {
            System.out.println("Insertion at ArrayList operation took longer.");
        } else {
            System.out.println("Insertion Both operations took the same duration.");
        }


        // removing

        Instant removingArr=Instant.now();
        arrayList.remove(arrayList.size()-1);
        Instant afterRemovingArr=Instant.now();

        Duration rmArr=Duration.between(removingArr,afterRemovingArr);
        Instant removingLl=Instant.now();
        linkedList.remove(arrayList.size()-1);
        Instant afterRemovingLl=Instant.now();
        Duration rmLl=Duration.between(removingLl,afterRemovingLl);

        if(rmArr.compareTo(rmLl)>0){
            System.out.println("arrayList took longer then LinkedLis for removing");
        }
        else if(rmArr.compareTo(rmLl)<0){
            System.out.println("Linked took longer for removing");
        }
        else{
            System.out.println("Both same at removing");
        }


        //getting
        Instant getArr=Instant.now();
        arrayList.get(arrayList.size()-1);
        Instant afterGetArr=Instant.now();
        Duration durationOfGetArr=Duration.between(getArr,afterGetArr);
        Instant getLl=Instant.now();
        linkedList.get(arrayList.size()-1);
        Instant afterGetLl=Instant.now();
        Duration durationOfGetLl=Duration.between(getLl,afterGetLl);

        if(durationOfGetLl.compareTo(durationOfGetArr)>0){
            System.out.println("get LinkedList took longer");
        }else if(durationOfGetLl.compareTo(durationOfGetArr)<0){
            System.out.println("get ArrayList took longer");
        }
        else {
            System.out.println("Both");
        }

    }
}
