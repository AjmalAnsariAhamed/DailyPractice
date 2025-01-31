package com.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(2);
        service.scheduleWithFixedDelay(()->{

            System.out.println("task execution after 5 minutes");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            };

        },0,4, TimeUnit.MILLISECONDS );
        service.scheduleWithFixedDelay(()->{

            System.out.println("2nd task execution after 5 minutes");
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            };
        },0,4, TimeUnit.NANOSECONDS );
// for stopping shutdown |
        //               V
        service.schedule(()->service.shutdown(),4,TimeUnit.NANOSECONDS);



    }
}
