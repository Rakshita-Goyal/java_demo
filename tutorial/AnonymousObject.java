package tutorial;
class A{
public A(){
    System.out.println("constructor of class A");
}
public void show(){
    System.out.println("hellooo");
}
}
public class AnonymousObject {
    public static void main(String[] args) {
    // A obj;//reference creation in the stack 
    // obj=new A();//object created in the heap. and assign the value to the reference variable
    // obj.show();

    new A().show();//anonymous object. we are not storing the object in the reference variable
    //can be used when we have to use the object only once
    //cant be used again as no reference variable is there to refer the object
    new A().show();  //constructor called each time as new object created each time
    }
}
