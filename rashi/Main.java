// Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems (now owned by Oracle) in 1995.
// It follows the principle: "Write Once, Run Anywhere" (WORA), meaning compiled Java code can run on any system with a Java Virtual Machine (JVM).

// | Term    | Full Form                | Purpose                                                                        |
// | ------- | ------------------------ | ------------------------------------------------------------------------------ |
// | **JDK** | Java Development Kit     | Includes tools to **develop** Java programs (compiler `javac`, debugger, JRE). |
// | **JRE** | Java Runtime Environment | Provides libraries and JVM to **run** Java programs, but no compiler.          |
// | **JVM** | Java Virtual Machine     | Executes **Java bytecode** and makes Java platform-independent.                |


// How Java Code Runs (Compilation & Execution Process)
// Write Code → Save file as MyProgram.java.
// Compilation (javac MyProgram.java)
// Java compiler converts .java file into bytecode (.class file).
// Execution (java MyProgram)
// JVM loads the .class file.
// Class Loader loads classes into memory.

// Bytecode Verifier checks for security violations.

// JIT Compiler converts bytecode into machine code for faster execution.
// Program runs on the target machine.

//main.class stores bytecode

// public static void main(String[] args)
// public → Accessible from anywhere.
// static → Can run without creating an object.
// void → No return value.
// main → Name recognized by JVM as the entry point.
// String[] args → Command-line arguments.

//java editions : standard ,enterprice, micro, java card
// | Type        | Size    | Default Value | Range / Description                      |
// | ----------- | ------- | ------------- | ---------------------------------------- |
// | **byte**    | 1 byte  | 0             | -128 to 127                              |
// | **short**   | 2 bytes | 0             | -32,768 to 32,767                        |
// | **int**     | 4 bytes | 0             | -2³¹ to 2³¹-1                            |
// | **long**    | 8 bytes | 0L            | -2⁶³ to 2⁶³-1                            |
// | **float**   | 4 bytes | 0.0f          | Decimal numbers (6–7 digits precision)   |
// | **double**  | 8 bytes | 0.0d          | Decimal numbers (15–16 digits precision) |
// | **char**    | 2 bytes | '\u0000'      | Single character / Unicode               |
// | **boolean** | 1 bit   | false         | true / false                             |

//primitive tupe :storing values
//reference type :storing complex objects
package rashi;
import java.lang.*;
import java.text.NumberFormat;
// import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.awt.*;
import java.util.Arrays;
public class Main {
public static void main(String[] args){
byte age =90;
System.out.println((age));
System.out.println("hello ");
int viewCount=123_456_789;// just to make large numbber readable
//java compiler sees as int only even if long used so at end of number put l/L
long bigNumber=6_123_456_789L;
Boolean isEligible=false;
//for primitive memory is taken released at runtime only by jre

//refernce type: at compile time hold memory.  relese by jre only
Date now= new Date(2025,5,31);
now.getTime();
System.out.println(now.getTime());

//primitive vs refernce type
byte x=1;
byte y=x;
x=2;//copioed by value  ,completely independent of each other
System.out.println(y);//1 only

Point point1=new Point(1,1);
Point point2=point1;//point1 and point 2 both refer to the ponit (1,1) which they hold address of point (1,1)
System.out.println(point2);//java.awt.Point[x=1,y=1]. 
point1.x=2;
System.out.println(point2);//2,1

//String
String message=new String("helllllo");//string object
String quickMessage="heyy";//looks like primitive but not it is refernce type only
System.out.println(quickMessage);
//concatenate
message=message+"hi";
//
// System.out.println(message);
// System.out.println(message.endsWith("i"));//true
// System.out.println(message.startsWith("he"));//true
// System.out.println(message.indexOf("hi"));
System.out.println(message.replace("he", "hhh"));
System.out.println(message); //no change here as strings in java are immutable
//whatever change you make not on the original string 

//escape sequence
//hello"world"
String quotedWord="hello\"world\"";
System.out.println(quotedWord);
//. c:\Windows\...    prefix with other blackslah
String mess="c:\\Windows\\...";
System.out.println(mess);
//\n. new line 
String mes="c:\nWindows";
// c:
// Windows
//combine
String me="c:\n\\Windows";
// c:
// \Windows

System.out.println(mes);

//Arrays
int numbers[]=new int[4];
numbers[0]=0;
numbers[1]=1;

//Arrays.fill(numbers, 9);  at all index only 9
System.out.println(Arrays.toString(numbers));

System.out.println(numbers);//base address
System.out.println(numbers[3]);//3

System.out.println(Arrays.toString(numbers));//the numbers[3] is not defined so replace by 0 if bollean type the by false
System.out.println(Arrays.binarySearch(numbers,2));

int []arr={8,9,6,7};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));

//multidimensional array
int num[][]=new int[3][3];
num[0][0]=1;
System.out.println(Arrays.toString(num));//give addresses only of the first element of evry part [[I@6d06d69c, [I@7852e922, [I@4e25154f]
System.out.println(Arrays.deepToString(num));//[[1, 0, 0], [0, 0, 0], [0, 0, 0]]
System.out.println(num[0][0]);//1

int[][] nums = new int[3][3];
for (int[] row : nums) {
    Arrays.fill(row, 9);
}
System.out.println(Arrays.deepToString(nums));
int n[][]={{1,2,3},{4,5}};
System.out.println(Arrays.deepToString(n));

//const final declaration 

final int a;
a=90;
//a=89;ggives error
//a=1;//can not assignmed again  once value is assigned

System.out.println(10/3); //gives 3

//int res=(double)10/(double)3;error
double res=(double)10/(double)3;
short w=12;
int z=w+90;
System.out.println(z);

double v=1.1;
double u=v+2;//3.1
//imlicit casting :no loss of data 
//byte>short>int>long >float>double

//explicit casting
double t=1.1;
int s= (int )t+2;//double has higher priority so change double t explicitly

String r="1";
//int q=(int)r+2;   cant cast string like that
//Float.parseFloat();Integer.parseInt();Double.parseDouble();
int q=Integer.parseInt(r)+2;
System.out.println(q);//3
//if r=1.1 it will give error   so parse using pasefloat or parsedouble


//mATH Class
//System.out.println(Math.round(1.1F));//1
//System.out.println(Math.ceil(1.1));2.0
//System.out.println((int)Math.ceil(1.1));2
//System.out.println(Math.max(1,1.1));//implicit casting 1.1
//int p=(int)Math.max(7.8,9.8);
//double p=Math.random()*100;  number between 0 to 100
//int p=(int)Math.round(Math.random()*100);   to get whole number 0 to 100
//int res=(int )Math.random()*100;  always 0 as int applied to value between 0 to 1 in math.random not the whole expression


//format number in java
//NumberFormat currency=new NumberFormat()//cant be instantiated it is abstract
NumberFormat currency=NumberFormat.getCurrencyInstance();
String result=currency.format(12344567.891);
System.out.println(result);//₹12,344,567.89
NumberFormat percent=NumberFormat.getPercentInstance();
System.out.println(percent.format(0.1));//10%
//or directly
String ans=NumberFormat.getPercentInstance().format(1.2);
System.out.println(ans);//120%

//take input

/*
Scanner scanner=new Scanner(System.in);
byte ages=scanner.nextByte();
System.out.println("you are "+age);*/

//reads the token  if i write rashi goyal    o/p will be you are rashi 
//so use nextLine();
//to trim scanner.nextLine().trim();


//control flow

//comparision opertators
System.out.println(1==9);
//logical operator. && || !(Not)
//assignment operqator =,+=,-=
//relational operator == <= >=
//unary operator -- ,++,+,-
//bitwise operator >>,<<,|,&,~
//ternery operator ?:



//if satements
//to declare we have to have block like if (){}. not just if()
int income=234;
Boolean bool=income>1200 ;// direct true or false
String str=income>1200 ?"high":"low";

String role="admin";
switch (role) {
    case "admin":
        System.out.println("admin role");
        break;
case "hr":
System.out.println("hr role");
    default:
    System.out.println("nothing");
        break;
}


//loops
//for loop 
//while loop
String input="";
//while(input!="quit")//error as we are comaring the addrese reference here
while(!input.equals("quit")){

}
//do while loop
int i=0;
do{
System.out.println("hey");
i++;
}while(i<10);

//break and continue
//break come out of loop from there only
//continue : move to next iteration


}    



public void run(){
    System.out.println("run the vehical");
}

}
// StringBuilder & StringBuffer

// StringBuilder → Mutable, faster, not synchronized (not thread-safe).

// StringBuffer → Mutable, synchronized (thread-safe, slower).

// Autoboxing (primitive → object)
// int a = 10;
// Integer obj = a; // autoboxing

// Unboxing (object → primitive)
// Integer obj = 20;
// int b = obj; // unboxing

// ArrayList<Integer> list = new ArrayList<>();
// list.add(10);   // primitive auto-converts to Integer
// list.add(20);


// enum Day { MONDAY, TUESDAY, WEDNESDAY }

// public class Main {
//     public static void main(String[] args) {
//         Day d = Day.MONDAY;
//         System.out.println(d);
//     }
// }

// Varargs (Variable Arguments)

// Allows passing multiple arguments to a method.

// public class Main {
//     static int sum(int... nums) { // treated as array
//         int total = 0;
//         for (int n : nums) total += n;
//         return total;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(1,2,3,4)); // 10
//     }
// }



// rakshitagoyal@Rakshitas-MacBook-Air java % javac rashi/Main.java
// rakshitagoyal@Rakshitas-MacBook-Air java % java rashi.Main

