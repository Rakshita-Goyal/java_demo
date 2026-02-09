import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffer {
     public static void main(String[] args) throws Exception {
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());

        System.out.println(name);
        System.out.println(age);

        }
    catch(Exception e){
        System.out.println("exception");
    }
    }

    
}
// System.in → byte stream (keyboard input)

// InputStreamReader → converts bytes → characters

// BufferedReader → reads text efficiently (line by line)

