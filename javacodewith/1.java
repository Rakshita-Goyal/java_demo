jdk:jre+compilaer,debugger,source file for java core classes
jre:to run java program,jvm+compiled core classes+libraries,+supporting files targeted to end users
jvm:actual engine that runs the java bytecode on any platform 

.java code written 
compiled to platform independent bytecode(.class)
execution by jvm 
interprets the bytecode to native code for specific os 


public static void main(String args[])
public :access modifier
static:method belongs to class rather than instance of 
void:method returns nothing 
String[]args:accepts array of strings as parameters,command line arguments can be passed to your program 

System.out.println
system:a class in the java lang package that provides access to the system ,including console
out:an instance of the printstream class within the system class ,representing console
println:method used to print a line of text to the console

compiler understands the ;

variables and data types:
intergral:byte(1) ,short(2),int(4) ,long(8)use L
decimal:float(4) use f,double(8)
boolean (1bit)
char(2 bytes)

java not pure oop
primitive datatypes also

typecast :
widening :implicit
narrowing :explicit

String object
directly literal or use new (object creation )

String str1="hello";
String str2="hello";
String str3=new String("hello");
str1==str2. (references are cheacked)
str2!=str3
str2.equals(str3)

string pool is part of heap memory
jvm sees if hello already present or not 
directly that string is referred
otherwise create it in string pool 

thats why immutable so that we dont change 
re initialize to change it 

arithmetics and bitwise operators 
relational operators & | ^ ~
logical operators && || !

conditional statements 
if else
switch statements
ternary operators

loops:
for 
for each 
while
do while


arrays:same type data
int []a=new int[4];;
class : fields and methods 

oops:
abstraction
inheritance
polymorphism
encapsulation 

abstract class 
interface:abstract methods,static variables and methods cant be overidden ,default method

multithreading :
a core is a indivisual processing unit within a cpu,a cpu has multiple cores
thread is smallest unit of execution within a process ,share same resiurce but run independent

multitasking allows os to run multiple processes simultaneously 
on single core cpus this is done through rapid switching \
on multicore ,true parrallel execution occurs ,taks executed across cores ,os schedular balances the load 

multithreading is ability to execute multiple threads within single process

mutitasking through multithreading ,,eash task is divided in threads managed concurrently 
multitasking:multiple applications 
multithreading:granular deals with multiple threads within same application
in java.lang

in single core ,javas multithreading is managed by jvm and os ,which switch bwteen threads to give illusion of concurrency
in multicore :jvm distributes threads across cores and true parrellel execution of threads

collection framework:
set of classes and interfaces that manage group of objects
solves inconsistency,lack of inter-operability ,no common interface

