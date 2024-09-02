package day9;

import java.util.Scanner;

public class TrafficLightControl {

    /*
     * Write a Java program that takes an integer input representing a traffic light
     * color code
     * (1 for Red, 2 for Yellow, 3 for Green) and uses a switch statement to print
     * the action to be taken:
     * 1: Stop
     * 2: Get Ready
     * 3: Go
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nEnter the traffic light color code \n 1 for Red \n 2 for Yellow \n 3 for Green ");
        int colorCode = scanner.nextInt();

        switch (colorCode) {
            case 1:
                System.out.println("Stop");
                break;
                case 2:
                System.out.println("Get Ready");
                break;
            case 3:
            System.out.println("Go");
            break;

            default:
            System.out.println("Enter valid code");
                break;
        }

scanner.close();
    }

}
