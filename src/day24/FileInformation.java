package day24;

import java.io.File;

public class FileInformation {


    public static void main(String[] args) {
        File file = new File("Demo.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Is file: " + file.length());
    
    
    if(file.canRead()) {
        System.out.println("File can be read");
    }
    else{
        System.out.println("File can not be read");
    }

    if (file.canWrite()) {
        
        System.out.println("file is writable");
    } else {
        System.out.println("file is not writable");
    }

    if (file.canExecute()) {
        System.out.println("file is executable");
    } else {
        System.out.println("file not executable");
    }






}
}