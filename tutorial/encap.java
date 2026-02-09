package tutorial;
class Human{


private int age;
private String name;

public Human(){
    System.out.println("this is contructor");
    age =12;
    name="shi";
}
public Human(String name,int age){
    System.out.println("paramertized constructor");
    this.name=name;
    this.age=age;

}

public void setAge(int age){
this.age=age;
}
public int getAge(){
return age;
}
//this for specifying the instance variable
//or we can take setname(string name,human obj)obj.name =name    but why to pass object in main function 
//so use this
public void setName(String name){
this.name=name;
}
public String getName(){
return name;
}
}
public class encap {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setName("rashi");
        System.out.println(obj.getName());
        obj.setAge(20);
       System.out.println( obj.getAge());

       //to assign the value when the object is created we use constructor. //every time we create the object
Human obj1=new Human("rasso",21);

    }
}
