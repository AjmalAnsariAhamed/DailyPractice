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
                for (int i=1;i<=10;i++){
                    System.out.println("A is running");
                    count.increment();
                }


            }
        });
        Thread B= new Thread(new Runnable(){

            @Override
            public void run() {

                for (int i=11;i<=20;i++){
                    System.out.println("B is running");
                    count.increment();
                }



            }
        });
        System.out.println("start");
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
        try{
            lock.lockInterruptibly();
            counter++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error");
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }


    }
    public int getCounter(){
        return counter;
    }
}
