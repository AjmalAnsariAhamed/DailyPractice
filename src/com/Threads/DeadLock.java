package com.Threads;

public class DeadLock {
    public static void main(String[] args) {
        Paper paper =new Paper();
        Pen pen=new Pen();
        Thread t1 = new Thread(new Task1(paper,pen),"Thread 1");
        Thread t2 = new Thread(new Task2(paper,pen),"Thread 2");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println("hello");
        }
        System.out.println("main Thread");
    }
}
class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){

            System.out.println(Thread.currentThread().getName()+" writing with pen and paper");
            paper.finishWriting();


    }
    public synchronized void finishWriting(){
        System.out.println("finished Writing");
    }
}
class Paper{
    public synchronized void writeWithPenAndPaper(Pen pen){

            System.out.println(Thread.currentThread().getName()+" writing with pen and paper");
            pen.finishWriting();


    }
    public synchronized void finishWriting(){
        System.out.println("finished Writing");
    }
}
class Task1 implements Runnable{
    private Paper paper;
    private Pen pen;

    public Task1(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }


    @Override
    public void run() {
        paper.writeWithPenAndPaper(pen);
    }
}
class Task2 implements Runnable{
    private Paper paper;
    private Pen pen;

    public Task2(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }


    @Override
    public void run() {
        synchronized (paper){
            pen.writeWithPenAndPaper(paper);// only run if paper is free,
        }

    }
}
