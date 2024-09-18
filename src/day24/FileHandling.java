package day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    static boolean isRunning = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {

            System.out.println("Menu");
            System.out.println("1. Create File");
            System.out.println("2. Write to File");
            System.out.println("3. Read File");
            System.out.println("4. Delete file");
            System.out.println("5. Get File Information");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    createFile(scanner);
                    break;
                case 2:
                    try {
                        writeFile(scanner); 
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        readFile(scanner);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    deleteFile(scanner);
                    break;
                case 5:
                    getInformationAboutFile(scanner);
                    break;
                case 6:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        scanner.close();
    }

    private static void createFile(Scanner scanner) {
        System.out.println("Enter the file name you want to create with extension");

        String filename = scanner.nextLine();

        File file = new File(filename);
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

    private static void writeFile(Scanner scanner) throws IOException {
        System.out.println("Enter the file name you want to write  with extension");
        String filename = scanner.nextLine();

        File file = new File(filename);
        System.out.println("Enter the data to write to the file");
        String data = scanner.nextLine();

        if (file.exists()) {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data);
            System.out.println("Data written to the file");
            fileWriter.close();
        } else {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(data);
            System.out.println("Data written to the file");
            fileWriter.close();
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.println("Enter the file name with extension you want to delete ");
        String filename = scanner.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            file.delete();
            System.out.println("File deleted");
        } else {
            System.out.println("File does not exist");
        }
    }

    private static void readFile(Scanner scanner2) throws FileNotFoundException {
        System.out.println("Enter the file name with extension you want to read ");
        String filename = scanner2.nextLine();
        File file = new File(filename);
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            System.out.println("File content:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } else {
            System.out.println("File does not exist");
        }
    }

    private static void getInformationAboutFile(Scanner scanner) {
        File file = new File("Demo.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length());
            System.out.println("File is readable: " + file.canRead());
            System.out.println("File is writable: " + file.canWrite());
            System.out.println("File is executable: " + file.canExecute());
            System.out.println("File is hidden: " + file.isHidden());
            System.out.println("File is directory: " + file.isDirectory());
            System.out.println("File is file: " + file.isFile());
        }
    }
}
