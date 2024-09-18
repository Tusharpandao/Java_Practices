package day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        File file = new File("Demo.txt");

        if (file.exists()) {
            FileReader fileReader = new FileReader(file);
            System.out.println(fileReader.read());

            System.out.println("data fetched from data.txt file using fileReader ");

            fileReader.close();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            System.out.println("data fetched from data.txt file using scanner ");
        }else{
            System.out.println("file does not exist");
        }







    }

}
