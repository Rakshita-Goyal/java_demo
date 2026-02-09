package tutorial;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

//prinln is a method of PrintStream class
//System is a class which has a static member out of type PrintStream
//out is the object of PrintStream class
//System.out is used to access the member of PrintStream class 
public class Input {
    public static void main(String[] args) throws IOException{
        System.out.println("hello" );
        System.out.println("enter a number");//90
       int num= System.in.read();//checked io exceptions
    System.out.println(num);//90 gives 57
    //gives ascii value of character
System.out.println(num-48);


//to solve this problem we use BufferedReader class
BufferedReader br=new BufferedReader(new java.io.InputStreamReader(System.in));
//or
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br1=new BufferedReader(isr);
int n=Integer.parseInt(br.readLine());
System.out.println(n);

//present way:scanner class

Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
System.out.println(n1);
sc.close();



    }
}
