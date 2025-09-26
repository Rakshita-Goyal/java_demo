package oops;

public class Abstraction {
    public static void main(String[] args) {
        bmw c1=new bmw();
        c1.start();
       System.out.println (c1.milage(20,23 ));
car c2=new bmw();//car refenced object of bmw can be made


     }
}
//abstraction to get just the concept of something which has to used by some differnt thing and can also have general info as well for all commom
class audi{

}
class bmw extends car{
public int milage(int dist,int fuel){
return dist/fuel*this.price;//price from the parent class

}
}
abstract class car{
    int price;
   void start(){
System.out.println("start the car");
    }
abstract int  milage( int distance,int fuel);
//abstract int x;   variables acnt be abstract in java


}