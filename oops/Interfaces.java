package oops;

public  class Interfaces{
    public static void main(String[] args){
Animal a1 = new Dog();
        a1.sound();   // Dog's implementation
        a1.eat();     // Dog's overridden default method
    ((Dog)a1).callOriginalEat(); //animals defalut eat.  just change the refernce to dog

        Animal.info(); // Static method of interface

        System.out.println();

        Animal a2 = new Cat();
        a2.sound();   // Cat's implementation
        a2.eat();     // Default method from interface

        System.out.println();

        // Using multiple interfaces
        Pet p = new Dog();
        p.play();    // Dog's play implementation




         Domestic d = new Cow();
        d.sound();    // Cow says: Moo Moo
        d.shelter();  // Cow lives in barn

        Animals a = new Cow();
        a.sound();   
    }
}

interface Animal {
    // Abstract method (must be implemented)
  public  void  sound();//always public type of defalut static

    // Default method (can be overridden)
    default void eat() {
        System.out.println("Eating...");
    }

    // Static method (called using interface name)
    static void info() {
        System.out.println("Animal Interface");
    }
}

// Another interface
interface Pet {
    void play();
}

// Implementing single interface
class Dog implements Animal, Pet {
    @Override
    public void sound() {
        System.out.println("Dog says: Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones...");
    }

     public void callOriginalEat() {
        Animal.super.eat();  // calls interface default method
    }

    @Override
    public void play() {
        System.out.println("Dog loves to play fetch");
    }
}

// Implementing interface without overriding default method
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat says: Meow Meow");
    }
}


//chained interface
interface Animals {
    void sound();
}

interface Domestic extends Animals {
    void shelter();
    void sound();
}

 class Cow implements Domestic {
    @Override
    public void sound() {
        System.out.println("Cow says: Moo Moo");
    }

    @Override
    public void shelter() {
        System.out.println("Cow lives in barn");
    }
}


