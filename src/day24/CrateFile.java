package day24;

import java.io.File;
import java.io.IOException;

public class CrateFile {

    public static void main(String[] args) {
        

        File file = new File("Demo.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            
        } else {
            try {
                file.createNewFile();
                System.out.println("File Created");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("File not created");
            }
            
        }
        
    }
    
}
