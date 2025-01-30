package com.Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDeadLock {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    void OuterMethod() {
        lock1.lock();
        System.out.println(Thread.currentThread().getName() + " acquired lock1, waiting for lock2");

        try {
            Thread.sleep(50); // Simulate some work
            lock2.lock();
            System.out.println(Thread.currentThread().getName() + " acquired lock2");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock2.unlock();
            lock1.unlock();
        }
    }

    void innerMethod() {
        lock2.lock();
        System.out.println(Thread.currentThread().getName() + " acquired lock2, waiting for lock1");

        try {
            Thread.sleep(50); // Simulate some work
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + " acquired lock1");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock1.unlock();
            lock2.unlock();
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
