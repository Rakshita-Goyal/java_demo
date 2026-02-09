package tutorial;
abstract class Car{
   public abstract void drive();
public abstract void fly();
    public void play(){
        System.out.println("car music playing");
    }
    
}
class Audi extends Car{
    public void drive(){
        System.out.println("audi is driving");
    }
    public void fly(){
        System.out.println("audi can fly");
    }
    public void  model(){
System.out.println("the model no is 23");
    }
}
abstract class Wagonr extends Car{
//in each class that extends the car the abstract mehtods hav eto declared otherwise it also becomes the abstract class
public  void drive(){
System.out.println("wagonr is driving");
}
}
class UpWagonr extends Wagonr{ //conrete class : its object can be made
    public void fly(){
        System.out.println("now wagonr fly");
    }
}
//if a extended class doesnt declare any metod it also becomes abstract class
public class Abstract {
    public static void main(String[] args) {
        
         //Car obj=new Car();  //error as we cant create object of abstract class
        Car obj=new Audi();
        obj.drive();
        obj.play();
        ((Audi)obj).model();
        Car obj2=new UpWagonr();
        obj2.drive();
        obj2.fly();

    }
}
 