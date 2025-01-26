package com.Collection;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedQDemo {
    static class Task implements Delayed {
private final String name;
private final long startTime;

        public Task(String name, long startTime,TimeUnit units) {
            this.name = name;
            this.startTime = System.currentTimeMillis()+units.toMillis(startTime);
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return System.currentTimeMillis()-startTime;
        }

        @Override
        public int compareTo(Delayed o) {
            if (this.startTime < ((Task) o).startTime) {
                return -1;
            }
            if (this.startTime > ((Task) o).startTime) {
                return 1;
            }
            return 0;
        }
        @Override
        public String toString(){
            return name+", "+startTime;
        }
    }

    public static void main(String[] args) {
        DelayQueue<Task> queue= new DelayQueue<>();
        queue.put(new Task("Task1",2,TimeUnit.SECONDS));
        queue.put(new Task("Task2",2,TimeUnit.SECONDS));
        queue.put(new Task("Task3",10,TimeUnit.SECONDS));
        queue.put(new Task("Task4",1,TimeUnit.SECONDS));
        System.out.println(queue);
    }
}
