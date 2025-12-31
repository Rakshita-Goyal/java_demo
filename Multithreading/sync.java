package Multithreading;
class Printer {
    public void printNumbers(String threadName) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " printing: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class sync extends Thread{
    Printer printer;

public sync(String name, Printer printer) {
    super(name);
    this.printer = printer;
}

public void run() {
    printer.printNumbers(getName());
}

    public static void main(String[] args) {
        Printer sharedPrinter = new Printer(); 
        sync t1 = new sync("Worker-1", sharedPrinter); 
        sync t2 = new sync("Worker-2", sharedPrinter);
         t1.start(); t2.start();


    }
}
// Synchronization in Java is a mechanism to control access of multiple threads to shared resources.

// Without it, if two or more threads try to modify a shared resource at the same time, data inconsistency or unexpected results can happen.

// Synchronization ensures thread safety → only one thread can access the critical section at a time.

