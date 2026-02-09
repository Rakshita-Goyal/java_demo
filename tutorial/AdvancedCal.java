package tutorial;

public class AdvancedCal extends Calculator {
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        if(b==0){
            System.out.println("denominator can not be zero");
            return 0;
        }
        return a/b;
    }
    
}
