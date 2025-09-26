package generics;
import java.util.List;

import generics.ListDemo;
public class main {
    public static void main(String[] args) {
    var list=new ListDemo();
//list.add(1);//primitive value but compiler converts it to INTEGER TYPE 
list.add(Integer.valueOf(1));

list.add("hi");//list.add(Character.valueOf("hi"));
list.add(new Object());


//problem with this.  the return type we want. expilitly change it
int num=(int)list.get(0);
//cast evrytime
String str=(String)list.get(1);


    }
}
