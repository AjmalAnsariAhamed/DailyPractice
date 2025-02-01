package com.Threads;

import java.util.concurrent.*;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int numberOFServices=3;
        ExecutorService exe= Executors.newFixedThreadPool(numberOFServices);
        CyclicBarrier latch= new CyclicBarrier(numberOFServices);

        exe.submit(new DependentService(latch));
        exe.submit(new DependentService(latch));

        exe.submit(new DependentService(latch));

        //latch.await(5, TimeUnit.SECONDS);
        //latch.await();
        System.out.println("Main");
        System.out.println(latch.getParties());
        exe.shutdown();

    }

}
class DependentService implements Callable<String>{
    private CyclicBarrier latch;

    public DependentService(CyclicBarrier latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try{
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName()+"\tservice");

        }finally{

            latch.await();
        }

        return "success";
    }
}
