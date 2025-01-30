package com.Threads;

public class ThreadCommunications {
    public static void main(String[] args) {
        SharedResources rs= new SharedResources();
        Thread p = new Thread(()->{
            for(int i=0;i<10;i++){
                try {
                    rs.producer(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        Thread c = new Thread(()->{
            for (int i=0;i<10;i++){
                try{
                    rs.consumer();
                }catch( Exception e){
                    Thread.currentThread().interrupt();}
            }
        });
        p.start();
        c.start();
    }
}
class SharedResources{
    private int data;
    private boolean hasData=false;
    public synchronized void producer(int i) throws InterruptedException {
       while(hasData){
           wait();
       }
        data=i;
        hasData=true;
        notify();

    }
    public synchronized int consumer(){
        while(!hasData){
            try{
                wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
        }
        System.out.println(data);
        hasData=false;
        notify();
        return data;

    }
}
