package oops;
import oops.printer;

public class lambdademo {
   
    public static void printtwice(){
// greet (new printerconsole(){
//  //anoynomous inner class :  class doesnt have. a name 
//  //its just the implementation 


// });
//inner class // only once required 
greet(new printer() {
    public void print(String mesg){

    }
});

//this lamda function 
greet(( mesg)->{
System.out.println("kiooo");
});
//or
greet(mesg->System.out.println(mesg));

}

    public static void greet (printer pri){
pri.print("hello world");
    }
}

