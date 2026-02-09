package Multithreading;

public class deadlock {
     static final String resource1 = "Printer";
    static final String resource2 = "Scanner";

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                synchronized(resource1) {
                    System.out.println("Thread 1 locked resource 1");

                    synchronized(resource2) {
                        System.out.println("Thread 1 locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized(resource2) {
                    System.out.println("Thread 2 locked resource 2");

                    synchronized(resource1) {
                        System.out.println("Thread 2 locked resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

// Thread 1 locks resource1 (Printer)

// Thread 2 locks resource2 (Scanner)

// Thread 1 tries to lock resource2 → ❌ blocked (Thread 2 has it)

// Thread 2 tries to lock resource1 → ❌ blocked (Thread 1 has it)

// Now:

// Thread 1 waiting for Thread 2

// Thread 2 waiting for Thread 1

// 😵 Both wait forever = DEADLOCK