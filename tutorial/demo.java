
package tutorial;//user defined package
//package is a namespace to organize the classes and interfaces
// Built-in (Java API) packages
//Predefined by Java.
import rashi.*;//imports the other package with all the file // you can specify the files also

//if package under package eg:: p1 is in p package so import p.* give the only in p package not the files of p1 for that import p.p1.*

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method with parameters
    void updateAge(int newAge) {
        age = newAge;
    }

    void display() { 
        System.out.println(name + " - " + age);
    }
}

 class add{
 
      int num=10; //can be used in mehtods but not declared there so not in the stack
    public int sum(int a ,int b){//local variable
        System.out.println(num);
        return a+b;
    }
    public String hey(int cost){

        System.out.println("heloo");
        if(cost>0)
        return ("working");

        return "nothing";
    }
    public float x(int a,int b){
        return a+b;//type conversion type

    }
     public double y(int a,int b){
        return a+b;//type conversion type
    }
    //  public double  x(int a,int b){
    // cant override like thissince the parameters are exactly same doesnt matter that return type changed
    //     return a+b;//type conversion type

    // }
     public int x(float a,float b){
        return (int)(a+b);//casting 

    }
}
public class demo {
public static void main(String[] args) { 
    add obj=new add();   //here obj is refernce variable
    //stored this new object in heap
    //heap has local variables   has num=10. and metoad  just the defination of it like the sum()
    //actual arrea in the stack
    //obj in stack linked (via address in value )to the heap memory for that object (defined at a address)
    //for each object in stack a memory  
    System.out.println("Sum is: "+obj.sum(50,10));//give 60
   System.out.println( obj.hey(70));//gives hello working
   obj.hey(70);//gives hello
String str=obj.hey(0);//gives hello
System.out.println(str);//gives hello working 

add obj1=new add();//new in heap memory also satck store obj1 liked both
obj.num=1;
System.out.println(obj.num);//1
System.out.println(obj1.num);//10.  //indivisual objects 


//evry mehtod has its own stack
//satck stores the variable and the value
//so main method is a stack then it stores local variables ,objects made and when any other mehtod called 
//like obj.sum this sum has its own stack. 

//array

// int []num={1,2,3};
// int[] a, b; // both are int arrays
// int a[], b; // a is int[], b is just int

int num[]={1,2,3};
int arr[]=new int[5];//declaration and memory allocation by default 0
System.out.println(arr);//gives the address of arr[0]
for(int x:num) //to print all the array
System.out.println(x);

System.out.println(Arrays.toString(num));
System.out.println(Arrays.toString(arr));

//multidimensional array 
int nums[][]=new int [3][4];//basically 3 arrays with 4 values in each 
for(int i=0;i<3;i++){
    for(int j=0;j<4;j++){
        nums[i][j]=(int)(Math.random()*10);
    }
}
for (int []x:nums){
    for(int y:x)
    System.out.print(y+" ");
}

//jagged array :internal array with differnet sizes
int n[][]=new int[3][];
//then for each define the size of each
n[0]=new int [3];
n[1]=new int[2];
n[2]=new int[3];

for(int i=0;i<n.length;i++){
    for(int j=0;j<n[i].length;j++){
        n[i][j]=(int)(Math.random()*10);
    }
}

//3 dimensional arrays also can be made each section becomes the array with internal arrays
int[][][] a= {
    {
        {1, 2, 3},
        {4, 5, 6}
    },
    {
        {7, 8, 9},
        {10, 11, 12}
    }
};

for (int i = 0; i < a.length; i++) {          // first dimension
    for (int j = 0; j < a[i].length; j++) {   // second dimension
        for (int k = 0; k < a[i][j].length; k++) {  // third dimension
            System.out.print(a[i][j][k] + " ");
        }
        System.out.println(); // new line after each inner array
    }
    System.out.println(); // blank line after each 2D block
}

//array of objects
   Student[] students = new Student[3];
        students[0] = new Student("Rakshita", 21);
        students[1] = new Student("Aarav", 22);
        students[2] = new Student("Neha", 20);

        System.out.println("Before update:");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }

        // calling method with parameter
        students[1].updateAge(23);  // updates Aarav's age

        System.out.println("\nAfter update:");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }


//String.  its a object
String name="rashi";
String na=new String("rashi");
System.out.println(na);//in heap memory rashi
na=na+"  goyal"; //now new memory allocated in heap with rashi goyal
//in stack na now points to this new address in heap
//old memory with rashi still present in heap but no reference to it so garbage collector will remove it later
System.out.println(na);//rashi goyal
//in heap there is string pool seprately present 
//in stack we have na at a address connected to heap memory with rashi
String s1 = "Rashi";
String s2 = "Rashi";
String s3= new String("Rashi");
System.out.println(s1 == s2);//true since both point to same place in heap string pool
//different refereences in the stack but same place linked to in the heap string pool
System.out.println(s2 == s3);//false since s3 created using new so in heap memory another place created
//this makes it immutable 
//once object created it cant be changed
//any change makes a new object in the heap memory
//string buffer and string builder are mutable  
//string buffer is synchronized and string builder is not synchronized so string builder is faster
StringBuilder sb=new StringBuilder("hello");
System.out.println(sb.capacity());//default 16+length of string. so 21   
//continous space reserved so that change in the heap
sb.append("  rashi goyal");
System.out.println(sb);//hello  rashi goyal
System.out.println(sb.capacity());//21 still as no new memory needed
sb.append("  how are you doing");
System.out.println(sb);//hello  rashi goyal  how are you doing
System.out.println(sb.capacity());//now new memory allocated  (old capacity*2)+2=43


}
}



