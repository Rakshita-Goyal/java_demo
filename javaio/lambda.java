package javaio;
interface MyInterface {
    void show();
}
interface MathOperation {
    int operation(int a, int b);
}
public class lambda {
    public static void main(String[] args) {
      MyInterface obj = () -> System.out.println("Hello with Lambda");
        obj.show();

        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;     
        MathOperation division = (a, b) -> a / b;


System.out.println(addition.operation(10, 5));       // 15
        System.out.println(subtraction.operation(10, 5));    // 5
        System.out.println(multiplication.operation(10, 5)); // 50
        System.out.println(division.operation(10, 5)); 
    }
}
