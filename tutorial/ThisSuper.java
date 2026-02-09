package tutorial;
//evry class in java extends the Object class
//a extends the object class ,b extends the class a , this is called multilevel 
class A extends Object{
 public A(){
    super();
System.out.println("constructor of class A");
 }
 public A(int n){
    super();//by defalut present in each constructor as first line
    System.out.println("constructor int para A "+n);
 }

}
class B extends A {
public B(){
this(5);//this calls the constructor of same class
//here i can not call this(). beacuse it would be the recursive call to same constructor 
//this will give para of class A sice this(n) go to B(int n)and it has the super(n )type    if simple super() then simple of the A

   //one constructor can have eihter the super or this as the first line 
    System.out.println("constructor of class B ");
}
public B(int n){

    super(n);//now in super the parameterized of A will be rteurned 
    //if we did not mention super (n) then by default the simple constructor of A would be called 
    
    System.out.println("constructor int para of b "+n);
}
}
public class ThisSuper {
    public static void main(String[] args) {
        B obj=new B() ;//first constructor of class A (simple wala) is called then B (paramertized wala);
//this calls constructor of same class 

    }
}
