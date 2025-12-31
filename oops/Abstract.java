package oops;

public class Abstract {
    public static void main(String[] args) {
        Dog d=new Dog();
System.out.println(d.x=10);
d.eat();//dog eat food
d.sound();//dog makes sound

Animal a1=new Dog();
a1.eat();//dog eat food
a1.sound();//dog makes sound
d.callParentEat();//eat food

//animal has normal eat mehtod also which is defined 
//override the parent /abstract mehtod    super.sound()
//or differnt function in this 

    }
}
//to define abstarct mehtod class has to abstract
abstract class Animal{
    //you cant define 
    Animal(){
        System.out.println("constructor");
    }
    abstract void sound();
    int x=0;//can define /declare non abstract also
    public void eat(){System.out.println("eat food");}

}
class Dog extends Animal{

void sound(){
    System.out.println("dog makes sound");
}
void callParentEat() {
        super.eat();  // calls Animal's version
    }
public void eat(){System.out.println("dog eat food");}

}