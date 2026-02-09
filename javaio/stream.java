package javaio;
import java.io.*;
import java.util.Scanner;
public class stream {
    


    public static void main(String[] args) {
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {
            
            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }
            System.out.println("Text copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("output_buffered.txt"))) {
                
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
                System.out.println("Text copied successfully using buffered streams!");
            } catch (IOException e) {
                e.printStackTrace();

    }

    //buffered reader and writer are used to read and write text from a file line by line
    try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // to maintain line breaks
            }
            System.out.println("File copied with buffer!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //scanner class is used to read input from the user or a file
       try {
            Scanner sc = new Scanner(new File("input.txt"));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // PrintWriter class is used to write formatted text to a file
        try (PrintWriter pw = new PrintWriter(new FileWriter("formatted_output.txt"))) {
            pw.printf("Name: %s%nAge: %d%n", "John Doe",        30);            System.out.println("Formatted text written to file!");
        } catch (IOException e) {
            e.printStackTrace();                                                                                  


        }



// Serialization → converting an object into a byte stream (to save in file or send over network).

// Deserialization → converting byte stream back to object.

// Use ObjectOutputStream and ObjectInputStream.

// Class must implement Serializable.


    }
}


// What is BufferedReader?

// ➡ Reads a full line at once
// ➡ Faster than FileReader
// ➡ Uses internal buffer (memory)