package tutorial;
//functional interface and lambda expression
@FunctionalInterface
interface A{
    public void run();
}
interface B{
public void show(int i);
}
interface C{
    public void hate(int i,int j);
}
interface D{
    public int hates(int i,int j);
}
// class B implements A{
//     public void run(){
//         System.out.println("running in b ");
//     }
// }
public class FunctionalInterfaceLambda {
    public static void main(String[] args) {
    //      A obj=new B();
    //  obj.run();

    A obj=new A() {
        public void run(){
            System.out.println("running in anonymous class");
        }
    };

    obj.run();
//lamda operation ::: there is only one mehtod so no need to write the class name and method name
    A obj1=()->{
        System.out.println("running in lambda expression");

    };
    obj1.run();


B obj2=new B() {
    public void show(int i){
System.out.println("in show of b with i");
    }
};

obj2.show(5);

//lambda function with a parameter
B ob=(int i)->{
System.out.println("in show using lambda ");
};
//not need of int also and bracket also as already mentioned in interface
//in lamda new file is not created for the class but the functionalinterfacelambda becomes heavy
ob.show(5);

C obj3=(i,j)->System.out.println("hello hate ");obj3.hate(9,0);
D onj=(i,j)-> i+j;  //this retuns i+j


    }

}
//lambda expression :: used to provide the implementation of the abstract method of a functional interface
//we can use lambda expression only with functional interface


