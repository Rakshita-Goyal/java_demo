package tutorial;
 interface  A {
    //variables in interface class has to be final or static
    int age=44;
    String name="rashi";
 public void show();    
public void display();
    
 }
 interface C{
public void run();
 }
 //a class can implement multiple interfaces
 //but in abstract only one class could be extendede

 interface D extends C{

 }
 class B implements A,D{
    public void show(){
        System.out.println("show from class B");
    }
    public void display(){
        System.out.println("display from class B");
    }
 public void run(){
    System.out.println("run of the class C");
 }
    //functionsl interface:: only one mehtod
 }
public class Interface {
    public static void main(String[] args) {
//A ob=new A() ;//error cant instantiate the interface
    A ob=new B();
ob.show();
ob.display();
D obj1=new B();
obj1.run();
//A.age=45;//error as final;
System.out.println(A.age);//directly access

        A obj=new A() {  //anonymous class implementing interface A
            public void show(){
                System.out.println("show from interface A");
            }
            public void display(){
                System.out.println("display from interface A");
            }
        };
        obj.show();
        obj.display();


    }
}


//types of interface :
//1) normal interface : multiple methods 
//2)functional interface/ SAM = only one method
//3)marker interface = blank interface : no methods   : beacuse we wantb to save object later 
