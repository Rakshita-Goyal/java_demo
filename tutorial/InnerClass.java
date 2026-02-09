package tutorial;
class A{
    int age;
    public void show(){
System.out.println("hello from outer class");
    }
    class B{
        public void config (){
System.out.println("config from inner class");
        }
        public void show(){
System.out.println("hello from inner class");
        }
    }
    static class C{
public void show(){
    System.out.println("hello from static inner class");
}
    }
}

abstract class Z{
    public abstract void show();
}

public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();//hello from outer class
      //  obj.config as config is of inner class
        A.B obj1=obj.new B();//to create object of inner class we need to have the object of outer class
        obj1.config();
        obj1.show();//hello from inner class

        //in inner class we dont need the object of outer class
        A.C obj2=new A.C();//static inner class object creation
        obj2.show();//hello from static inner class


///        AnonymousObject innerclass 
//when we want to overide the mehtod but use only once then why to extend it and make a new class for that

A ob=new A()
{
public void show()
{
    System.out.println("this is new show overridden anonmously");
}};
ob.show();//this us new...
//a class is made in package called InnerClass$1.class no name for it 
//its like InnerClass$1 is extending A 


//anonymous +abstract 
Z object=new Z() {
    public void show(){
        System.out.println("this anonymous class of the asbtract class Z");
    }
};
object.show();

    }
}
