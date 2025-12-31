package oops;

public class MainClass {
    public static void main(String[] args) {
        person p=new person();
System.out.println(p.name);
p.run();
p.run(34);

person p2=new person(12,"rashi");//firstly the this() defalult called then the the control again to present constructor

p2.run();//rashi is 12


developer d1=new developer(23,"yui");
d1.run();



//encapsulaton 
Encapsulation e1=new Encapsulation();
e1.doWork();

    }
}
//class can only be final static public


class person{
protected String name;//by defalut null

int age;//by default 0
public person(){
System.out.println("the default constructor ");
}
public person(int age,String name){
    this();
this.name=name;
this.age=age;
}
public void run(){
    System.out.println(name+" is of "+age);
}
public void run(int steps){
    System.out.println(name +" walks "+steps);
}
}

//inheritance
//in run time polymorphishms:  same mehtod both class , first seracj in the child then of not present go to the parent its like chain go back and back

class developer extends person{
public developer(int age,String name){
    //calling person constructor can use its prop mehtods
    super(age,name);

}
void walk(){
    System.out.println(name+"in the child class ");
};
}


