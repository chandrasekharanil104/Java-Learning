package dev.MultiThreading;


public class FirstMultiThreadingPractice implements Runnable{
    public void run(){
        int i = 1;
        while (i < 10000000){
            System.out.println("Hello " + i);
            i++;
        }
    }
    public static void main(String[] args) {
        FirstMultiThreadingPractice thread = new FirstMultiThreadingPractice();
        Thread t = new Thread(thread);
        t.start();

        int i = 1;
        while (i < 10000000) {
            System.out.println("World " + i);
            i++;
        }
    }
}
