package com.Collection;

import java.util.ArrayDeque;

public class CircularBufferQ<T> {
    private ArrayDeque<T> queue;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayDeque<T> getQueue() {
        return queue;
    }

    public void setQueue(ArrayDeque<T> queue) {
        this.queue = queue;
    }

    private int capacity;

    public CircularBufferQ( int capacity) {
        this.queue = new ArrayDeque<>();
        this.capacity = capacity;
    }

    public void add(T t){
        if(queue.size()==capacity){
            queue.poll();
        }
        queue.offer(t);
    }
    public T remove(){
        if(queue.isEmpty()){
            throw new IllegalStateException();
        }
       return queue.poll();
    }
    public boolean isEmpty(){
      return  queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }
    public boolean isFull(){
        if (queue.size()==capacity){
            return true;
        }
        return false;
    }
    public T peek(){
        if(queue.isEmpty()){
            throw new IllegalStateException();
        }
        return queue.peek();
    }
    @Override
    public String toString(){
     return   queue.toString();
    }

    public static void main(String[] args) {
        CircularBufferQ<Integer> circularQ=new CircularBufferQ<>(4);
        System.out.println(circularQ);
        circularQ.add(1);
        System.out.println(circularQ);
        circularQ.add(3);
        System.out.println(circularQ);
        circularQ.add(9);
        System.out.println(circularQ);
        circularQ.add(20);
        System.out.println(circularQ);
        circularQ.add(66);
        System.out.println(circularQ);

circularQ.remove();
        System.out.println(circularQ);
        circularQ.remove();
        System.out.println(circularQ);
        circularQ.remove();
        System.out.println(circularQ);
        circularQ.remove();
        System.out.println(circularQ);

    }
}
