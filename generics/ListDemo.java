package generics;

//Generics allow you to write classes, interfaces, and methods with a placeholder for types.
//Instead of writing the same code for Integer, String, Double, etc., you can write type-safe reusable code.
//Eliminates casting → you don’t need to cast objects from Object.

public class ListDemo {
    //implemented list
    //private int[] item=new int[10];
    //private users[] items=new users[10];
private Object[] items=new Object[10];

private int count;
public void add (Object item){
    items[count++]=item;

}
public Object get (int index){
    return items[index];
}

}
//if want to store users but here only intergers allowed
//so for all
//we can use Ojects

