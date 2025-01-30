package com.Threads;

public class ThreadDeadLock {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    void OuterMethod() {

        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " acquired lock1, waiting for lock2");

            try {
                Thread.sleep(50); // Simulating some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " acquired lock2");
            }
        }
    }

    void innerMethod() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " acquired lock2, waiting for lock1");

            try {
                Thread.sleep(50); // Simulating some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " acquired lock1");
            }
        }
    }

    public static void main(String[] args) {
        ThreadDeadLock s = new ThreadDeadLock();

        Thread A = new Thread(s::OuterMethod, "Thread-A");
        Thread B = new Thread(s::innerMethod, "Thread-B");

        A.start();
        B.start();

        try {
            A.join();
            B.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Thread Finished");
    }
}
