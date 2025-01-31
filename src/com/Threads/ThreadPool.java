package com.Threads;

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
        Thread pool[]=new Thread[10];
        for (int i=1;i<=10;i++){
            final int v=i;
            pool[i-1]=new Thread(()->{

                System.out.println(factorial(v));
            });
            pool[i-1].start();

        }
    }
}
