package com.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
class Counter1{
    private ReadWriteLock lock= new ReentrantReadWriteLock(true);
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
        //r1 : 1
//r2 :1
//r2 :2
//r1 : 2
//r2 :3
//r1 : 3
//r2 :4
//r1 : 4
//r1 : 5
//r2 :5
//r1 : 6
//r2 :6
//r2 :7
//r1 : 7
//r2 :8
//r1 : 8
//r2 :9
//r1 : 9
//r2 :10
//r1 : 10
//r2 :11
//r1 : 11
//r2 :12
//r1 : 12
//r1 : 13
//r2 :13
//r2 :14
//r1 : 14
//r2 :15
//r1 : 15
//r2 :16
//r1 : 16
//r2 :17
//r1 : 17
//r2 :18
//r1 : 18
//r2 :19
//r1 : 19
//r2 :20
//r1 : 20


    }
}


