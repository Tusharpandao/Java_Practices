package com.booststar.day8;

public class Loop_iterete {

    /*Create a Java program that uses a loop to iterate through an array of strings.
     If a string starts with the letter "A", print its length and continue to the next iteration.
     If a string starts with the letter "B", break out of the loop. */
    

     public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Cat", "Dog", "Elephant", "Ant", "Bear"};

        for (String word : words) {
            if (word.startsWith("A")) {
                System.out.println(word + " starts with 'A' and its length is: " + word.length());
                continue;
            }
            
            if (word.startsWith("B")) {
                System.out.println("Found a word starting with 'B'. Breaking the loop.");
                break;
            }

            System.out.println("Processing: " + word);
        }
    }
}
