package oops;
//functional interface is a interface with a single abstract mehtod

@FunctionalInterface
public interface printer {
   void print(String message);//there is abstract so it is functional interface ,it can can have as many default static 
   default void printtwice(String message){
    System.out.println(message);
    System.out.println(message);
   }
 static void info() {
        System.out.println("Functional Interface example");
    }
}
