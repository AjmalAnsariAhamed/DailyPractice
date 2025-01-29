package com.Threads;

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
       lock.lock();
       try{
           counter++;
       }finally {
           lock.unlock();
       }





    }
    public int getCounter(){
        return counter;
    }
}
