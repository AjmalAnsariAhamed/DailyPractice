package com.Threads;

import java.util.concurrent.*;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int numberOFServices=3;
        ExecutorService exe= Executors.newFixedThreadPool(numberOFServices);
        CountDownLatch latch= new CountDownLatch(numberOFServices);
        latch.countDown();
        exe.submit(new DependentService(latch));
        exe.submit(new DependentService(latch));

        exe.submit(new DependentService(latch));

        latch.await(5, TimeUnit.SECONDS);
        //latch.await();
        System.out.println("Main");
        exe.shutdown();
    }

}
class DependentService implements Callable<String>{
    private CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName()+"\tservice");

        }finally{

            latch.countDown();
        }

        return "success";
    }
}
