package tutorial;
import java.lang.*;;
class A{
    //it has super class as obj 
    String name;
    int age;
public String toString(){
    return name+" "+age;

}
public Boolean equals(A that){
return this.name.equals(that.name) && this.age==that.age;

}}


public class ObjectClass {
    public static void main(String[] args) {
        A obj =new A();
        obj.name="rashi";
        obj.age=90;
        System.out.println(obj);//tutorial.A@1dbd16a6
        System.out.println(obj.toString());//tutorial.A@1dbd16a6
        //now when we have toString mehtod explicitly in the class   it gives hey in obj and obj.toString().  
System.out.println(obj.toString());
//so if not present explicitly call the object otherwise from the class 
System.out.println(obj);// rash 90 
 A obj1 =new A();
        obj1.name="rashi";
        obj1.age=90;
boolean res=obj.equals(obj1);  //false as the hexadecimal value of both are seen so make own equal mehtod
//but after the custom made method which sees the value and compare it it comes to be true
System.out.println(res);  //true now 

    }
}
