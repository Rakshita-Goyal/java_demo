package oops;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ExepHand {
    public static void main(String[] args) {
        //  try {
        //     int a = 10 / 0; // ArithmeticException
        // } catch (ArithmeticException e) {
        //     System.out.println("Error: " + e);
        //     throw new ArithmeticException("Manually thrown exception");
        // } 
        
        // finally {
        //     System.out.println("Finally block always runs");
        // }
        // //finallly has to be with just afterb try catch or just try 

        //checked exception 
FileReader fr=null;
        try {
    fr = new FileReader("abc.txt");
    var value=fr.read();
    new SimpleDateFormat().parse("null");
    System.out.println("file opened ");
}
catch(FileNotFoundException e){
    System.out.println("file not found");
}
 catch(IOException e) {
    System.out.println("File not found");
}
catch (ParseException e){
e.printStackTrace();
}
finally{
   // fr.close();///here also it will exeption of 
    if(fr!=null){
        try{
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
//here positions of catch of bith the exeption matters
//if we just put ioexeption it will handle file not found also as it lie lower in heirarchy of checking
//one more exception parse exeption same concept 
System.out.println("this will work anyway as after try catch block");

//if abc file exits 
// file opened
// This will print as after try catch block

//if abc file doesnt exist
// new FileReader("abc.txt") throws a FileNotFoundException (which is a subclass of IOException).
// Control jumps to the catch block.

show();// give nullPinterExeption 

//var reader=new FileReader(file.txt);    gives error as file doesnt exist


    }
    public static void show(){
sayHello(null);
    }
    public static void sayHello(String name){
        System.out.println(name.toUpperCase());
    }
}
// Error: java.lang.ArithmeticException: / by zero
// Finally block always runs
// Exception in thread "main" java.lang.ArithmeticException: Manually thrown exception
//         at oops.ExepHand.main(ExepHand.java:9)


//if we write someting after try catch block it will work properly only

//exeption : checked ,unchecked ,errors
//checked : should be handled by developer.  edges cases handled.  eg ioexception ,sql exception   //checked at compile time
//unchecked (runtime error)  programming error.  eg: nullPointer error,arithmetic exepction,Indexbound exception ,illegal state ,illegal argument.   do automated testing

//error:external to application 
//eg stake overflow. ,outOfMemory error


//throwable is exception class
//exeption error
//unchecked : runtimeeaxception  unchecked derived from exception which is checked


//throw explicitly throw exception 

//throws.   may throw a exception 
class Demo {
    void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt"); // may throw IOException
    }
}


// Custom Exceptions
// We can create our own exceptions by extending Exception (checked) or RuntimeException (unchecked).


// class MyException extends Exception {
//     public MyException(String msg) {
//         super(msg);  // Pass the message to Exception class constructor
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         try {
//             throw new MyException("Custom exception occurred");
//         } catch (MyException e) {
//             System.out.println(e.getMessage());
 //               e.printStackTrace(); 
//         }
//     }
// }

