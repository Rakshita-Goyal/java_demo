package tutorial;
//upcasting   and downcasting 
class A{
public void show(){
System.out.println("in a show");
}
}
class B extends A{
public void show2(){
System.out.println("in b show");
}
}
public class UpDownCast {
    public static void main(String[] args) {
        A obj =new A();
        A obj1=new B();
        obj.show();
        obj1.show();
        //obj1.show2();//error as obj1 is of type A and show2 is not in A
//         The reference type of obj1 is A.
// So at compile time, the compiler looks inside class A — but there’s no method show2() defined there.

// Even though the object is actually of class B,
// the compiler only allows methods that exist in the reference type (A).

// // This is a rule of upcasting:
// When you upcast (B → A), you can only access methods that are defined in class A.
// (Overridden methods from B still run — but new methods in B are hidden from view.)
//downcasting

((B)obj1).show2(); //Down  casting
//or 
B ob=(B)obj1;
ob.show2();

//here obj1 is of type A but we know its of type B so we type cast it to B and then call the show2 method
//but if obj1 was of type A
//then it would have given error at runtime as A cannot be converted to B. 

        A obj2=new B() ;
        obj2.show();//in a

        A obj3=(A)new B();  //upcasting as going up the hierarchy       upcasting happens automatically
        //object of B but refer to A
        obj3.show();//in a
       //obj.show2();//error as obj is of type A and show2 is not in A.  downcast it to B
       ((B)obj3).show2();//in b show
               
    }
}
