package tutorial;

 //multiple inheritance not supported in java
    //gives error as multiple inheritance is not allowed in java
//but we can do it by interfaces
//dont know whose method is called at runtime

interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {  // ✅ multiple inheritance via interfaces
    public void showA() { System.out.println("A"); }
    public void showB() { System.out.println("B"); }
}
//or just have show in both classes and then implement in c and when called the one implementation in c is called 


//mehtod overriding 

public class Inheritance {
    public static void main(String[] args) {
       Calculator obj=new Calculator();
         int sum=obj.add(5, 3);
         int difference=obj.sub(5, 3);
         AdvancedCal obj1=new AdvancedCal();
         int product=obj1.multiply(5, 3);
         int adder=obj1.add(5, 3); //inherited from calculator class
         int quotient=obj1.divide(5, 0); 
         VeryAdv obj2=new VeryAdv();
            double power=obj2.power(2, 3);
            System.out.println(power);

                C o=new C();
            o.showA(); 
            o.showB();
    }
}
