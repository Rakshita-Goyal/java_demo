package tutorial;
//specific constants rather than creating class with multiple objects

enum Status{
    Running,Failed,Pending,Success
}
enum Laptop{
    Mac(200),Windows(100),Linux(300),Ubuntu;
    private int price;
    private Laptop(){
        price =9000;
    }
    private Laptop(int price){
    this.price=price;}

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

//so this is like the constructor for the class 
// and the objects mac window are already set so for that we need to pass parameter of price as constructor
    
}

//in java enum is taken as 

public class Enum {
    public static void main(String[] args) {
        Status s=Status.Running;

        System.out.println(s.getClass().getSuperclass());//class.java.lang.Enum
        System.out.println(s);
        System.out.println(s.ordinal());//index here 0
        Status[] ss=Status.values();
System.out.println(ss[0]);
for( Status x:ss){
System.out.println(x);
}

Status s1=Status.Pending;
if(s1==Status.Running){
    System.out.println("it is running");
}
else if(s1==Status.Pending){
    System.out.println("it is pending");
}
else if (s1==Status.Failed){
    System.out.println("it is failed");
}
else if(s1==Status.Success){
    System.out.println("it is success");
}
else{
    System.out.println("it is nothing");
}

//switch 
Status sis=Status.Running;
switch(sis){
    case Running:{
    System.out.println("running");
break;
}
    case Pending:
    System.out.println("pending");
}

Laptop lap=Laptop.Mac;
System.out.println(lap);//mac 
System.out.println(lap.getPrice());//200

Laptop u=Laptop.Ubuntu;
System.out.println(u.getPrice());//90000

    }
}
//enum is class 
//we can not extend enum with other class
//enum extends enum class 
