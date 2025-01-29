package com.Threads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreading {

    public static void main(String[] args) throws InterruptedException {
        Counter count=new Counter();
        Thread A= new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i=1;i<=1000;i++){
                    count.increment();
                }


            }
        });
        Thread B= new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i=1001;i<=2000;i++){
                    count.increment();
                }



            }
        });
        A.start();
        B.start();
        A.join();
        B.join();

        System.out.println(count.getCounter());

    }
}
class Counter{
    private int counter=0;
    private Lock lock=new ReentrantLock();
    public void increment(){
        boolean locked = false;
        try {
            locked = lock.tryLock(100, TimeUnit.MILLISECONDS);
            if (locked) {
                counter++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Error");
                    Thread.currentThread().interrupt();
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
            Thread.currentThread().interrupt();
        } finally {
            if (locked) { // Only unlock if lock was acquired
                lock.unlock();
            }
        }




    }
    public int getCounter(){
        return counter;
    }
}
