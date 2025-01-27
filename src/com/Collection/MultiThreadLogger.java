package com.Collection;

import java.util.concurrent.ConcurrentLinkedQueue;

public class MultiThreadLogger {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<String> queue=new ConcurrentLinkedQueue<>();
        Thread consumer=new Thread(()->{
            try {
                while(true){
                    String message =queue.poll();
                    if(message!=null){
                        if(message.equals("stop")){
                            break;
                        }
                        System.out.println(message);
                        Thread.sleep(1000);
                    }

                }


            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        Thread producer1=new Thread(()->{
            for(int i=0;i<=20;i++){
                queue.offer("Log number is\t"+i);
                System.out.println("added"+i);
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread producer2=new Thread(()->{
            for(int i=21;i<=40;i++){
                queue.offer("Log number is\t"+i);
                System.out.println("added"+i);
                try {
                    Thread.sleep(100);

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
long time=System.currentTimeMillis();
        producer1.start();
        producer2.start();


        producer1.join();
        producer2.join();
        queue.offer("stop");
        consumer.start();
        consumer.join();
        System.out.println(System.currentTimeMillis()-time);
        time=System.currentTimeMillis();
        producer1.run();
        producer2.run();
        queue.offer("stop");
        consumer.run();
        System.out.println(System.currentTimeMillis()-time+"normal");


    }
}
