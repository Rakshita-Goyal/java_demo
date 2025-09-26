package oops;

public class extra {
    public static void main(String[] args) {
         // Local final variable
        final int x = 10;
        System.out.println("x = " + x);

        // x = 20;  ❌ Error: cannot assign a value to final variable

        // Final reference variable
        final StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");   // ✅ Allowed (content changes)
        System.out.println(sb);

        // sb = new StringBuilder("Hi"); ❌ Error: cannot reassign reference

        

        //static 
        //count was 0 as first than when object created each time ,count ++,constructor called  each time ,same will get incremented
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.count); // 3 (shared value)
    
    //static mehtod
     int result = MathUtil.square(5); // call without object
        System.out.println(result);


        //static bloack
        
    }

}
 //final mehtods : can not be overridden
class Parent {
    final void show() {
        System.out.println("Final method in Parent");
    }
    //final can be overloaded though
    final void show(String s) {
        System.out.println("Final method in Parent"+s);
    }
}

class Child extends Parent {
    // ❌ Not allowed
    // void show() { System.out.println("Trying to override"); }
}

//final class cant be extended
final class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// ❌ Error: Cannot inherit from final class
// class Car extends Vehicle {}



//static keyword
// static means belonging to the class, not to objects.
// Shared across all objects of the class.

// Static Variables (a.k.a. Class Variables)
// A variable declared with static belongs to the class, not to any instance.
// All objects share the same copy.

class Counter {
    static int count = 0;  // static variable (shared)
    
    Counter() {
        count++;  // increment each time object is created
    }
}


//static mehtod
class MathUtil {
    static int square(int x) {  // static method
        return x * x;
    }
}

// Static Blocks

// Runs once when the class is loaded into memory.

// Used to initialize static variables.
class StaticBlockDemo {
    static int num;
    
    // static block
    static {
        num = 100;
        System.out.println("Static block executed, num = " + num);
    }
    
    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
//Static methods cannot use non-static data directly.

//inner outer class 
class Outer {
    private String outerMsg = "Hello from Outer";

    class Inner {
        void msg() {
            System.out.println("Inner class");
            System.out.println("Accessing outer: " + outerMsg);
        }
    }
}

// public class extra {
//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         Outer.Inner inner = outer.new Inner();
//         inner.msg();
//     }
// }




