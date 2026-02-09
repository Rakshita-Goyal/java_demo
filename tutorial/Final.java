package tutorial;
//final as variable mehtod and class 
 class Calc{
    public final void show(){
        System.out.println("its calc show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
//to stop a class from getting extended make it final
class AdvancedCal extends Calc{   //gives error if the parent class is final
//to stop from getting our mehtod overriddened make it Final
// public void show(){
//     System.out.println("adva ka show");
// }.   gives error
}
public class Final {
   public static void main(String[] args) {
    //final to make constant
    final int num;
    num=90;//only once value can be assigned
    //num=90;error
    Calc obj=new Calc();
    obj.show();
    obj.add(3, 4);

   } 
}
