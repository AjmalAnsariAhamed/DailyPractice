package com.Collection;

import java.util.concurrent.PriorityBlockingQueue;

public class TaskProcessorSimulation {
    static class Task implements Comparable{
        private int priority;


        private String name;

        public Task(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }


        @Override
        public int compareTo(Object o) {
            if(o==null){
                return 1;
            }
            Task other=(Task)o;
            return Integer.compare( other.getPriority(),priority);


        }
        @Override
        public String toString(){
            return priority+", "+name;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<Task> simulator= new PriorityBlockingQueue<>();
        Thread producer=new Thread(()->{
            try {
                for(int i=1;i<=10;i++){
                    simulator.put(new Task(i,String.format("task named with %d",i)));
                }
            } catch (Exception e){
                Thread.currentThread().interrupt();
            }

        });

        Thread consumer= new Thread(()->{
            try {
                while(true){
                    Task task = simulator.take();
                    System.out.println("Processing: " + task);
                    Thread.sleep(1500);
                }

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();
        System.out.println("Thread work is done"+simulator);
        producer.join();
        System.out.println("Thread work is done"+simulator);
        consumer.join();

        System.out.println("Thread work is done"+simulator);


    }
}
