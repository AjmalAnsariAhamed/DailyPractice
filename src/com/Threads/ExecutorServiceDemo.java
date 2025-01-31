package com.Threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(2);
        Future<Integer> result;
        Future<?>result1;
        result=service.submit(()->1+1);// returns a value means its Callable
        System.out.println(result.get());
        result=service.submit(()->1+2);
        System.out.println(result.get());
       result= service.submit(()->1+3);
        System.out.println(result.resultNow());
        result1=service.submit(()-> System.out.println("hello"),"Success");// its a Runnable
        System.out.println(result1.get());

    }
}
