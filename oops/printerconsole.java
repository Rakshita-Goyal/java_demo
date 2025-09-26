package oops;
import oops.printer;
public class printerconsole implements printer{
    public void  print(String message){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        // Lambda implementing single abstract method
        //since only abstract mehtod so can define lamda 
        printer obj = (String msg) -> System.out.println("Display from lambda"+msg);
        
        obj.printtwice(null);   // calls the lambda
        printer.info();     // calls static method
        
    }
}
