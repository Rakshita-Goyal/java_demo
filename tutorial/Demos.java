package tutorial;
class Mobile{
    static{//called once only to initialise the 
        name="phone";
        System.out.println("once only");
    }
    public Mobile(){
        System.out.println("called each time");
brand=" vivo";
price=200;
    }
String brand;
int price;
static String name;
public void display(){
    System.out.println(brand+" "+name+" "+price);
}
public static void show(){//non static variables can not be used in static mehtod.  because obj we are calling for
    System.out.println("hello");
}
//to solve this we have to take the object referce that we refering to a particular object
public static void show1(Mobile obj){//non static variables can not be used in static mehtod.  because obj we are calling for
    System.out.println(obj.brand+" "+obj.price+" "+name);
}

}
public class Demos {
    public static void main(String[] args)throws ClassNotFoundException {
        //just to load the class and we are not calling the obj or class
//Class.forName("Mobile");

        Mobile obj1=new Mobile();//static block first called then the constructor
    Mobile obj2=new Mobile();
    obj1.name="rashi";//since the name is static it is common to the all the objects of the class 
    obj2.name="goyal";
    obj1.display();//give rashi
    obj2.display();//give rashi
obj2.name="goyal";//give goyal for both the objects
System.out.println(Mobile.name);//goyal by the class name 
obj2.brand="nike";
Mobile.show1(obj2);



}


}
