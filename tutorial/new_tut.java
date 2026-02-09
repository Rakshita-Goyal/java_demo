public class new_tut {
    public static void main(String[]args){
        Class c=new_tut.class;
        System.out.println(c.getClassLoader());
         System.out.println(String.class.getClassLoader());  
    }
}

// new_tut is your own class

// It is loaded by Application ClassLoader


// String belongs to java.lang package

// It is loaded by Bootstrap ClassLoader

// Bootstrap ClassLoader is written in native code (C/C++)

// In Java, its reference is shown as null