package javaio;
import java.io.*;

class Student implements Serializable {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class serial_deserial {
    public static void main(String[] args) {
        System.out.println("Serialization and Deserialization in Java");

 Student s1 = new Student("Rakshita", 22);

        // Serialization:object to stream bytes 
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(s1);
            System.out.println("Object serialized!");
            //oject se bytestream then store its functions members in database
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student s2 = (Student) in.readObject();
            
            System.out.println("Deserialized Student: " + s2.name + ", " + s2.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        // Random Access File Example   
        try {
            RandomAccessFile raf = new RandomAccessFile("file.txt", "rw"); // "rw" = read & write

            raf.seek(10);  // move to 10th byte
            raf.writeBytes("Hi");

            raf.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }


    }
}

