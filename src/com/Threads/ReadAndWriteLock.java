package com.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
class Counter1{
    private ReadWriteLock lock= new ReentrantReadWriteLock();
    private Lock writeLock= lock.writeLock();
    private Lock readLock= lock.readLock();
    private int  counter=0;

    public void increment (){
        writeLock.lock();
        try{
            counter++;
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }finally {
            writeLock.unlock();
        }
    }

    public int getCounter() {
        readLock.lock();
        try{
            return counter;
        }
        finally {
            readLock.unlock();
        }

    }
}
public class ReadAndWriteLock {




    public static void main(String[] args) {
        Counter1 c= new Counter1();
        Thread write = new Thread(()->{
            for (int i=0;i<20;i++){
                c.increment();
            }

           });
        Thread read1= new Thread(()-> {
            for(int i=0;i<20;i++){
                System.out.println("r1 : "+c.getCounter());
            }
        });
        Thread read2= new Thread(()-> {
            for(int i=0;i<20;i++){
                System.out.println("r2 :"+c.getCounter());
            }
        });;

        write.start();
        read1.start();
        read2.start();
        try{
            write.join();
            read1.join();
            read2.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
//        r2 :20
//        r1 : 20
//        r2 :20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r2 :20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r2 :20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r1 : 20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20
//        r2 :20


    }
}


