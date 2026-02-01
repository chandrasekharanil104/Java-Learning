package dev.MultiThreading;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        for(int i = 0; i < 10000000; i++){
            System.out.println("Thread " + getName() + " is running: " + i);
            Thread.yield();
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t = new MyThread("Luffy");

        t.setDaemon(true);
        t.start();

        for(int i = 0; i < 10000000; i++){
            System.out.println("Thread Main" + " is running: " + i);

        }
    }
}
