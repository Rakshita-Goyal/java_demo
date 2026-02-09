package tutorial;
class myexception extends Exception{
    public myexception(String str){
       super (str); 
    }
}
class A{
    public void msg()throws ClassNotFoundException{
        System.out.println("hello");
    }
}
public class Exceptions {
    public static void main(String[] args) {

        A a=new A();
        try{
            a.msg();
        }
        catch(ClassNotFoundException e){
            System.out.println("handled");
        }
       

       int i=12;
    //    int j=0;
    String  str=null;
    int []num=new int[4];
       try{
        int j=10/i;

        if(j==0){//since thrown atch will catch it
            //throw new ArithmeticException();
            throw new ArithmeticException("dont want zero");   //here this message will be taken as e 
        }
        if(j==1){
            throw new myexception("my excepion");
        }
       System.out.println(str.length());
       System.out.println(num[4]);//jump of try block
       System.out.println(num[1]);//skip as out of try block
       }
       catch (myexception e){
System.out.println("my exception "+e);
       }
       catch(ArithmeticException e){
System.out.println("excep "+e);

       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("execp"+e);
       }
       catch (Exception e){//at end the parent cxlass 
        System.out.println("any exception "+e);
       }
       finally{
        System.out.println("will alwys work");
       }
       System.out.println("normal");
    }
}
//types of error
//compile time : incorrect syntax
//runtime error: occurs during program execution. :file execution 
//logical error: produces incorrect output

//heirarchy
//object class at top
//then throwable : error and exception 
//error: tread die, ioerror, out of memory virtual machine error
//exception divided into runtime exception sql exception 
//in runtime exception : arithmatic,arrayoutofbound,null.    unchecked excrption :your choice
//sql: ioexcep.  checked  : forcefully handle

//throws when we dont put critical part in class but the class in which that method is called 
//this go up to heirarchy