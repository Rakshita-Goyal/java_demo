package tutorial;
//want to make the objects as threads
//thread is a lightweight process
//thread is a path of execution within a process
//every java program has atleast one thread that is main thread

//every thread has a run method
class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("in A");
            try{
                Thread.sleep(1000);//1 sec
            }catch(InterruptedException e){
                System.out.println(e);
        }
    }
}
}
// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("in B");
//             try{
//                 Thread.sleep(1000);
//             }
//             catch(InterruptedException e){
//                 System.out.println(e);      
//         }
//     }}

// }
public class Threads {
    public static void main(String[] args) {
        A a=new A();
        //Runnable b=new B();
        //or
        Runnable b=new Runnable() {
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("in B");
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        };
        //a.run();//it will be executed by main thread
        //b.run();

        System.out.println(a.getPriority());
       
        a.start();//it will be executed by a new thread

        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

 Thread t1=new Thread(b);
    t1.start();

 try {
            a.join();
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

       //these two threads will be executed by cpu
        //cpu will allocate time to each thread
        //cpu will do context switching between these two threads

        //schedular to suggest ,how many time a thread should run
        //it is not necessary that a thread will run for the time suggested by schedular
        //it may run for less time or more time
        //it depends on the cpu 

        
        //for that ask the function to wait: use of sleep method
    }
}

//new runnable running (sleep wait) waiting dead
