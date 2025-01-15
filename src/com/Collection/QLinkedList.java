package com.Collection;

import java.util.LinkedList;

public class QLinkedList {
    private LinkedList<Integer> Queue = new LinkedList();
    public int enQueue(int i){
        Queue.add(Integer.valueOf(i));
        return i;
    }
    public int deQueue(){
        Integer i=Queue.removeFirst();
        return (int)i;
    }
    public void peek(){
        System.out.println(Queue.peek());
    }
    public String toString(){
        return Queue.toString();
    }
    public  LinkedList<Integer> reversedLinkedList(){
        LinkedList<Integer>dupe=(LinkedList<Integer>) Queue.clone();
        dupe.sort((x,y)-> y-x);
        System.out.println("reversed LinkedList"+dupe);
        return dupe;
    }
    public static void main(String arg[]){
        QLinkedList queue=new QLinkedList();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.peek();
        System.out.println(queue);
        queue.deQueue();
        System.out.println(queue);
        queue.reversedLinkedList();
        queue.peek();
        System.out.println(queue);


    }
}
