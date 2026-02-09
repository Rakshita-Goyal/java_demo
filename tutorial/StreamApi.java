package tutorial;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;
public class StreamApi {
    public static void main(String[] args) {
        List<Integer> l=Arrays.asList(1,2,3,4,5);
       for(int i=0;i<l.size();i++){
        System.out.println(l.get(i) );
       }
       //consumer is a functional interface with abstract method accept 
       Consumer<Integer> c=new Consumer<Integer>(){
        public void accept(Integer i){
            System.out.println(i);
        }
       };

       l.forEach(c);


       Stream   <Integer> s=l.stream();
       s.forEach(n-> System.out.println(n));    

       x
    }
}
