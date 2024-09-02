package day5_minor_test2;
import java.util.Scanner;

public class PrimeNumberChecker {
    /*
     * o Task: Write a program that checks if a given number is prime.
     * o Objective: Work with loops and understand the concept of prime numbers.
     * o Skills: Loops, conditional statements.
     */

     public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        
        System.err.print("Enter the number to check if if Prime or not :  ");

        int number=scanner.nextInt();

        boolean isPrime=checkPrime(number);


        if (isPrime) {
            System.out.println(number +" is a prime number");
        }
        else{
            System.out.println(number + " is not prime number");
        }


        scanner.close();
     }

     private static boolean checkPrime(int num){
        if (num <= 1) {
            
            return false;
        }
        for(int i= 2; i<=(num-1);i++){
            if(num %i ==0){

                return false;
            }
            
        }
        return true;

        
     }
}
