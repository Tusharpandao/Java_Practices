package day24;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    
    public static void main(String[] args) throws IOException {
        File file = new File("Demo.txt");

        if (file.exists()) {
            
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("Data from java Program");
            System.out.println("data written to the  file");
            fileWriter.close();
        } else {
            file.createNewFile();
            System.out.println("one file will created");
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("Data from java Program");
            System.out.println("data written to the  file");
            fileWriter.close();          
        }


    }
}
