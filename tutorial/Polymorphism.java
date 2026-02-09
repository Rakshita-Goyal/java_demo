package tutorial;
class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
//compile time (mehtod overloading). early binding . runtime time(mehtod overriding )late binding 
public class Polymorphism {
    public static void main(String[] args) {
         Animal a = new Animal();
        a.sound();  // Animal makes a sound
a=new Dog();
a.sound();//dog barks    this is called dynamic 
        // Dog d = new Dog();
        // d.sound();  // Dog barks

        // Animal a2 = new Dog();//refering the a2 as animal but its dog ,    as dog is also a animal so fine 
        // a2.sound(); // Dog barks → runtime polymorphism
    }
}
