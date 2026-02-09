package tutorial;
abstract class Computer{
    public abstract void code();
}
class Laptop extends Computer{
public void code(){
    System.out.println("code it");
}
}
class Desktop extends Computer{
    public void code(){
        System.out.println("code it");
    }
}

// class Developer{
// public void develop(Laptop lap){
//     lap.code();
// }
//}
class Developer{
    public void develop(Computer c){
        c.code();
    }
}

public class why_interface {
    public static void main(String[] args) {
        // Laptop lap=new Laptop();
        // Developer dev=new Developer();
        // dev.develop(lap);
        // Desktop desk=new Desktop();
       // dev.develop(desk);       give error as error as develop is tightly bond with laptop can take its reference only
       //create. a computer class which will be extended by the laptop and desktop
       //developer usees the computer to give reference 


       Computer lap=new Laptop();
       Developer dev=new Developer();
Computer desk=new Desktop();
dev.develop(desk);
       dev.develop(lap);

    }
}
