package com.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static int factorial(int num){
        if (num == 0 || num ==1) return 1;

       int result=1 ;
       for (int i=1;i<=num;i++){
           result=result*i;

       }
       return result;
    }

    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(2);
        for(int i=1;i<=10;i++){
            final int v=i;
            executor.submit(()->{
                System.out.println(factorial(v));
            });
        }
        executor.shutdown();
        try{
            while(!executor.awaitTermination(10, TimeUnit.MILLISECONDS)){
                System.out.println("running ");
            }
        }catch(InterruptedException e){

        }
        System.out.println("all threads are terminated");


    }
}
