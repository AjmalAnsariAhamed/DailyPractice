package com.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) throws InterruptedException {

        Map<Integer, String> map = new ConcurrentHashMap<>();


        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread t1 adding key 10");
            map.putIfAbsent(10, "ten");
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread t2 replacing key 1 -> One");
            map.put(1, "One");
        });
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread t3 replacing key 1 -> Onee");
            map.put(1, "Onee");
        });


        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");


        t1.start();
t2.start();
t3.start();
        for (Integer key : map.keySet()) {
            System.out.println("Main thread iteration: " + key + " -> " + map.get(key));
            Thread.sleep(1000); // Simulate work
        }


        t1.join();
        t3.join();
        t2.join();


        System.out.println("Final map content:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
