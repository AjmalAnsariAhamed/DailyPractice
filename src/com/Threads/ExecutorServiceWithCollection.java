package com.Threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceWithCollection {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<Integer>> list=Arrays.asList(()->1,()->2,()->4+10);
        ExecutorService service= Executors.newFixedThreadPool(3);
      List<Future<Integer>> result= service.invokeAll(list);
      result.stream().forEach(f-> {
          System.out.println(f.resultNow());
      });

      service.shutdown();
    }
}