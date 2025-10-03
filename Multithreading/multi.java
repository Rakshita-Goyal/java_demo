package Multithreading;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread is running...");
    }
}

public class multi {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // start() internally calls run()

         Thread t2= new Thread(new MyRunnable());
        t2.start();

        Thread t3 = new Thread(() -> {
            System.out.println("Thread using Lambda running...");
        });
        t3.start();

t1.setName("Worker-1"); 
t2.setName("Worker-2");

t1.setPriority(Thread.MIN_PRIORITY); // 1 t2.setPriority(Thread.MAX_PRIORITY); // 10
t3.setPriority(Thread.NORM_PRIORITY); // 5

        try {
            t1.join(); // wait for t1 to finish
            t2.join(); // wait for t2 to finish
            t3.join(); // wait for t3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After join, isAlive t1: " + t1.isAlive());
         System.out.println("Main thread finished.");




    }
}

// Thread class is used to create a thread by extending it and overriding its run() method