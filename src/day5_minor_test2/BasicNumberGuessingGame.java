package com.booststar.day5_minor_test2;


import java.util.Random;
import java.util.Scanner;

public class BasicNumberGuessingGame {
    /*
     * o Task: Develop a simple number guessing game where the user has to guess a
     * number between 1 and 100. The program should give hints if the guess is too
     * high or too low.
     * o Objective: Understand loops and random number generation.
     * o Skills: Loops, conditional statements, random number generation.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);
        
        scanner.close();
    }
}
