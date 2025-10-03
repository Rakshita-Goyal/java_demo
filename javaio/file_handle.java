package javaio;

import java.io.File;

public class file_handle {
    public static void main(String[] args) {
        //System.out.println(System.getProperty("user.dir")); //current working directory for the file handling

    File file = new File("/Users/rakshitagoyal/Desktop/java/javaio/file.txt");
//file.createNewFile(); //creates the file if it does not exist
file.delete(); //deletes the file
//System.out.println(file.exists()); //true if file exists else false
 
File dir = new File("myFolder");
dir.mkdir();          // creates directory
dir.delete();  
// deletes directory

String[] files = dir.list(); // returns array of file names
for(String f : files) System.out.println(f);


        if (file.exists()) {
            System.out.println("File Name: " + file.getName());//file.taxt
            System.out.println("Path: " + file.getAbsolutePath());///Users/rakshitagoyal/Desktop/java/javaio/file.txt
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size: " + file.length() + " bytes");
//             Writable: true
// Readable: true
// File Size: 4 bytes
        } else {
            System.out.println("File does not exist.");
        }
}
}
