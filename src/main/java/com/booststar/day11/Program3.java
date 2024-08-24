package com.booststar.day11;

import java.util.Scanner;

public class Program3 {

    //Java program that takes a user input number and then prints all
// numbers from 1 up to that number.

public static void main(String[] args) {
    
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter the number : ");

    int number=scanner.nextInt();

    for (int i = 1; i <= number; i++) {
        
        System.out.print(i+ " ");
    }


    scanner.close();

}
    
}
