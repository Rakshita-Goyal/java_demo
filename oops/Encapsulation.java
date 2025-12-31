package oops;

public class Encapsulation {
    public static void main(String[] args) {
        //enscapsulation
        //data hiding 
        //mehtod and variables together

        Laptop l1=new Laptop();
        l1.setPrice(90);
       System.out.println( l1.getPrice());

    }
    public void doWork(){
        //public use anywhere protected in subclasses(outside tye package as well) and within same package private only the class in
//default in same package
        System.out.println("in encapsulation class do work function ");
    }
   


}
 class Laptop{
int ram;
private int price;

 public void setPrice(int p){
    //is the user admin
    boolean isAdmin=false;
    if(!isAdmin){
        System.out.println("you can not setprice");
    }
    else
this.price=p;
    }
    public int getPrice(){
        return price;
    }

    }

