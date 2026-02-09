package tutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.    util.List;
import java.util.Map;
import java.util.HashMap;   
class Student{
    int rollno;
    String name;
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public String toString(){
        return rollno+" "+name;
    }
}
public class CollectionsDemo {
    public static void main(String[] args) {
        Collection c=new ArrayList();//here datatype not mentioned ,here taken as the objects only
        c.add(78);
        c.add("x");
        System.out.println(c);
        List<Integer> c1=new ArrayList<>();//generic collection
        c1.add(90);
        //c1.add("y");//error
        System.out.println(c1);

        Iterator<Integer> itr=c1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()); //gives object type data        

        }

        Map<String,Integer> m=new HashMap<>();
        m.put("a", 1);
        m.put("b", 2);

        for(String s:m.keySet()){
            System.out.println(s+" "+m.get(s));
        }  
        
        Collections.sort(c1);

        Comparator<Integer> cmp=new Comparator<Integer>(){
 public int compare(Integer o1,Integer o2){
    if(o1%10>o2%10) return 1;
     return 0;
 }
        };

        Comparator<Student> cmp1=new Comparator<Student>(){
            public int compare(Student s1,Student s2){
                if(s1.rollno>s2.rollno) return 1;
                return 0;
            }
        };  

        Collections.sort(c1,cmp);
        System.out.println(c1);
       
    }
}

//collection is an interface which has multiple child interfaces like list,set,queue,dequeue,map
//collection interface has multiple methods which are overridden in its child interfaces


