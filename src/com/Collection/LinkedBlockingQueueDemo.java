package com.Collection;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        AtomicBoolean flag= new AtomicBoolean(true);
        LinkedBlockingQueue<String>calls=new LinkedBlockingQueue<>();
        Thread inComing=new Thread(()->{
            try {
            for (int i=0;i<20;i++){

                    calls.put("call number\t"+(i+1));
                    System.out.println("added "+(i+1));
                    Thread.sleep(500);
                }
                System.out.println("All calls are added");
            flag.set(false);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        Thread consumer = new Thread(()->{
            while(flag.get() || !calls.isEmpty()){
                try {
                    String liftCall=calls.take();
                    if(liftCall!=null){
                        System.out.println("lifted the call "+liftCall);
Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        // Start the threads
        inComing.start();
        consumer.start();

        // Wait for threads to finish
        try {
            inComing.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Call center simulation completed.");
    }
}
