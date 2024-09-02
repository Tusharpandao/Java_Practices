package day14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class Calculator {

    public Map<String, Double> cart = new HashMap<>();
    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Sum of Two Numbers");
            System.out.println("2. Check Even or Odd");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Factorial of a Number");
            System.out.println("5. Fibonacci Series");
            System.out.println("6. Reverse a Number");
            System.out.println("7. Palindrome Number");
            System.out.println("8. Armstrong Number");
            System.out.println("9. Swap Two Numbers Without Using a Third Variable");
            System.out.println("10. Find Largest of Three Numbers");
            System.out.println("11. Check Leap Year");
            System.out.println("12. Sum of Digits of a Number");
            System.out.println("13. Calculate Power of a Number");
            System.out.println("14. Find GCD and LCM");
            System.out.println("15. Check Anagram Strings");
            System.out.println("16. Count Number of Vowels and Consonants in a String");
            System.out.println("17. Find Duplicate Characters in a String");
            System.out.println("18. Remove All White Spaces from a String");
            System.out.println("19. Reverse a String");
            System.out.println("20. Sort an Array Using Bubble Sort");
            System.out.println("21. Find Second Largest Element in an Array");
            System.out.println("22. Binary Search Implementation");
            System.out.println("23. Check if Array is Sorted");
            System.out.println("24. Merge Two Sorted Arrays");
            System.out.println("25. Find the Intersection of Two Arrays");
            System.out.println("26. Transpose a Matrix");
            System.out.println("27. Rotate a Matrix by 90 Degrees");
            System.out.println("28. Check if Two Strings are Rotations of Each Other");
            System.out.println("29. Find the Missing Number in an Array");
            System.out.println("30. Calculate Sum of Elements in an Array");
            System.out.println("31. Remove Duplicates from an Array");
            System.out.println("32. Convert a String to a Number (Without Using Library Functions)");
            System.out.println("33. Implement Caesar Cipher Encryption");
            System.out.println("34. Find the First Non-Repeated Character in a String");
            System.out.println("35. Check if a String is a Substring of Another String");
            System.out.println("36. Count the Frequency of Each Character in a String");
            System.out.println("37. Implement Decimal to Binary Conversion");
            System.out.println("38. Find the Largest Sum Contiguous SubArray");
            System.out.println("39. Check if a Number is Perfect, Deficient, or Abundant");
            System.out.println("40. Reverse Words in a String");
            System.out.println("41. Find the Longest Word in a Sentence");
            System.out.println("42. Check if a Sentence is a Pangram");
            System.out.println("43. Implement Basic Calculator (Add, Subtract, Multiply, Divide)");
            System.out.println("44. Find the Day of the Week for a Given Date");
            System.out.println("45. Generate Random Numbers within a Given Range");
            System.out.println("46. Implement a Simple Banking System (Deposit, Withdraw, Check Balance)");
            System.out.println("47. Simulate a Basic Voting System");
            System.out.println("48. Create a Simple Library Management System");
            System.out.println("49. Simulate a Basic ATM Machine");
            System.out.println("50. Calculate Compound Interest");
            System.out.println("51. Implement a Simple Student Grading System");
            System.out.println("52. Convert Roman Numerals to Integer");
            System.out.println("53. Create a Simple To-Do List Application");
            System.out.println("54. Find All Prime Numbers within a Given Range");
            System.out.println("55. Generate the First N Prime Numbers");
            System.out.println("56. Implement a Simple E-Commerce Cart System");
            System.out.println("57. Simulate a Simple Traffic Light System");
            System.out.println("58. Calculate the Area and Perimeter of Different Shapes");
            System.out.println("59. Convert Decimal to Hexadecimal and Vice Versa");
            System.out.println("60. Calculate the Sum of All Prime Numbers Below N");
            System.out.println("61. Find the Sum of All Even Fibonacci Numbers Below N");
            System.out.println("62. Convert Binary to Hexadecimal");
            System.out.println("63. Implement a Simple Text-Based Game");
            System.out.println("64. Implement a Simple Stopwatch");
            System.out.println("65. Create a Simple Employee Management System");
            System.out.println("66. Find the Most Frequent Element in an Array");
            System.out.println("67. Check if a Number is a Happy Number");
            System.out.println("68. Generate Random Alphanumeric Strings");
            System.out.println("69. Implement a Simple Encryption and Decryption System");
            System.out.println("0. Exit");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sumOfTwoNumbers(scanner);
                    break;
                case 2:
                    checkEvenOrOdd(scanner);
                    break;
                case 3:
                    checkPrimeNumber(scanner);
                    break;
                case 4:
                    factorialOfNumber(scanner);
                    break;
                case 5:
                    fibonacciSeries(scanner);
                    break;
                case 6:
                    reverseNumber(scanner);
                    break;
                case 7:
                    palindromeNumber(scanner);
                    break;
                case 8:
                    armstrongNumber(scanner);
                    break;
                case 9:
                    swapTwoNumbers(scanner);
                    break;
                case 10:
                    findLargestOfThreeNumbers(scanner);
                    break;
                case 11:
                    checkLeapYear(scanner);
                    break;
                case 12:
                    sumOfDigits(scanner);
                    break;
                case 13:
                    calculatePower(scanner);
                    break;
                case 14:
                    findGCDandLCM(scanner);
                    break;
                case 15:
                    checkAnagramStrings(scanner);
                    break;
                case 16:
                    countVowelsAndConsonants(scanner);
                    break;
                case 17:
                    findDuplicateCharacters(scanner);
                    break;
                case 18:
                    removeWhiteSpaces(scanner);
                    break;
                case 19:
                    reverseString(scanner);
                    break;
                case 20:
                    sortArrayUsingBubbleSort(scanner);
                    break;
                case 21:
                    findSecondLargestElement(scanner);
                    break;
                case 22:
                    binarySearchImplementation(scanner);
                    break;
                case 23:
                    checkIfArrayIsSorted(scanner);
                    break;
                case 24:
                    mergeTwoSortedArrays(scanner);
                    break;
                case 25:
                    findIntersectionOfArrays(scanner);
                    break;
                case 26:
                    transposeMatrix(scanner);
                    break;
                case 27:
                    rotateMatrixBy90Degrees(scanner);
                    break;
                case 28:
                    checkIfStringsAreRotations(scanner);
                    break;
                case 29:
                    findMissingNumber(scanner);
                    break;
                case 30:
                    calculateSumOfArrayElements(scanner);
                    break;
                case 31:
                    removeDuplicatesFromArray(scanner);
                    break;
                case 32:
                    convertStringToNumber(scanner);
                    break;
                case 33:
                    caesarCipherEncryption(scanner);
                    break;
                case 34:
                    findFirstNonRepeatedCharacter(scanner);
                    break;
                case 35:
                    checkIfStringIsSubstring(scanner);
                    break;
                case 36:
                    countCharacterFrequency(scanner);
                    break;
                case 37:
                    decimalToBinaryConversion(scanner);
                    break;
                case 38:
                    largestSumContiguousSubarray(scanner);
                    break;
                case 39:
                    checkNumberPerfectDeficientAbundant(scanner);
                    break;
                case 40:
                    reverseWordsInString(scanner);
                    break;
                case 41:
                    findLongestWordInSentence(scanner);
                    break;
                case 42:
                    checkIfSentenceIsPangram(scanner);
                    break;
                case 43:
                    basicCalculator(scanner);
                    break;
                case 44:
                    findDayOfWeek(scanner);
                    break;
                case 45:
                    generateRandomNumbers(scanner);
                    break;
                case 46:
                    simpleBankingSystem(scanner);
                    break;
                case 47:
                    simulateVotingSystem(scanner);
                    break;
                case 48:
                    simpleLibraryManagementSystem(scanner);
                    break;
                case 49:
                    simulateATM(scanner);
                    break;
                case 50:
                    calculateCompoundInterest(scanner);
                    break;
                case 51:
                    simpleStudentGradingSystem(scanner);
                    break;
                case 52:
                    convertRomanNumeralsToInteger(scanner);
                    break;
                case 53:
                    simpleToDoListApplication(scanner);
                    break;
                case 54:
                    findAllPrimeNumbers(scanner);
                    break;
                
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Implementations for the static methods

    public static void sumOfTwoNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
    }

    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }

    public static void checkPrimeNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is a prime number." : " is not a prime number."));
    }

    public static void factorialOfNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void fibonacciSeries(Scanner scanner) {
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void reverseNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

    public static void palindromeNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    public static void armstrongNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (original == sum) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }

    public static void swapTwoNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: First number = " + a + ", Second number = " + b);
    }

    public static void findLargestOfThreeNumbers(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest number: " + largest);
    }

    public static void checkLeapYear(Scanner scanner) {
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
    }

    public static void sumOfDigits(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    public static void calculatePower(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }

    public static void findGCDandLCM(Scanner scanner) {
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int gcd = gcd(a, b);
        int lcm = Math.abs(a * b) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void checkAnagramStrings(Scanner scanner) {
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void countVowelsAndConsonants(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void findDuplicateCharacters(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Duplicate characters: ");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void removeWhiteSpaces(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String result = str.replaceAll("\\s+", "");
        System.out.println("String without whitespaces: " + result);
    }

    public static void reverseString(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    public static void sortArrayUsingBubbleSort(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void findSecondLargestElement(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println("Not enough elements.");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > first) {
                second = first;
                first = value;
            } else if (value > second && value != first) {
                second = value;
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest element: " + second);
        }
    }

    public static void binarySearchImplementation(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void checkIfArrayIsSorted(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isSorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Array is " + (isSorted ? "sorted." : "not sorted."));
    }

    public static void mergeTwoSortedArrays(Scanner scanner) {
        System.out.print("Enter number of elements in first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter number of elements in second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged array: " + Arrays.toString(merged));
    }

    public static void findIntersectionOfArrays(Scanner scanner) {
        System.out.print("Enter number of elements in first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter number of elements in second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("Intersection: " + intersection);
    }

    public static void transposeMatrix(Scanner scanner) {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrixBy90Degrees(Scanner scanner) {
        System.out.print("Enter number of rows/columns (for square matrix): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        System.out.println("Matrix rotated by 90 degrees:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void checkIfStringsAreRotations(Scanner scanner) {
        System.out.print("Enter first string: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        if (isRotation(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }

    private static boolean isRotation(String str1, String str2) {
        return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }

    public static void findMissingNumber(Scanner scanner) {
        System.out.print("Enter number of elements (excluding missing number): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        int totalSum = (n + 1) * (n + 2) / 2;
        int missingNumber = totalSum - sum;

        System.out.println("Missing number: " + missingNumber);
    }

    public static void calculateSumOfArrayElements(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }

    public static void removeDuplicatesFromArray(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        for (int value : arr) {
            set.add(value);
        }

        System.out.println("Array with duplicates removed: " + set);
    }

    public static void convertStringToNumber(Scanner scanner) {
        System.out.print("Enter a number in string format: ");
        String str = scanner.next();
        try {
            int number = Integer.parseInt(str);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }

    public static void caesarCipherEncryption(Scanner scanner) {
        System.out.print("Enter a string to encrypt: ");
        String str = scanner.next();
        System.out.print("Enter shift value: ");
        int shift = scanner.nextInt();
        String encrypted = caesarCipher(str, shift);
        System.out.println("Encrypted string: " + encrypted);
    }

    private static String caesarCipher(String str, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                result.append((char) ((ch - base + shift) % 26 + base));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void findFirstNonRepeatedCharacter(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeated character found.");
    }

    public static void checkIfStringIsSubstring(Scanner scanner) {
        System.out.print("Enter main string: ");
        String mainStr = scanner.next();
        System.out.print("Enter substring: ");
        String subStr = scanner.next();

        if (mainStr.contains(subStr)) {
            System.out.println(subStr + " is a substring of " + mainStr);
        } else {
            System.out.println(subStr + " is not a substring of " + mainStr);
        }
    }

    public static void countCharacterFrequency(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character frequencies: " + charCount);
    }

    public static void decimalToBinaryConversion(Scanner scanner) {
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary representation: " + binary);
    }

    public static void largestSumContiguousSubarray(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxSum = arr[0], currentSum = arr[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Largest sum of contiguous subarray: " + maxSum);
    }

    public static void reverseArray(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void countDigitsInString(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        int digitCount = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        System.out.println("Number of digits: " + digitCount);
    }

    public static void checkIfStringIsPalindrome(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.next();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static void sumOfOddNumbersInArray(Scanner scanner) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
    public static void checkNumberPerfectDeficientAbundant(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDivisors = 0;
    
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
    
        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else if (sumOfDivisors < number) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is an abundant number.");
        }
    }
     
    public static void reverseWordsInString(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        System.out.println("Reversed words in string: " + reversed.toString().trim());
    }

    
    public static void findLongestWordInSentence(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        String longestWord = "";
    
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    
        System.out.println("Longest word: " + longestWord);
    }
    public static void checkIfSentenceIsPangram(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean[] alphabet = new boolean[26];
        int index = 0;
    
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                index = c - 'a';
                alphabet[index] = true;
            }
        }
    
        for (boolean b : alphabet) {
            if (!b) {
                System.out.println("The sentence is not a pangram.");
                return;
            }
        }
    
        System.out.println("The sentence is a pangram.");
    }

    
    public static void basicCalculator(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
    
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
    
        System.out.println("Result: " + result);
    }
    public static void findDayOfWeek(Scanner scanner) {
        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();
        System.out.print("Enter month (MM): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (DD): ");
        int day = scanner.nextInt();
    
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
    
        System.out.println("Day of the week: " + dayOfWeek);
    }
    public static void generateRandomNumbers(Scanner scanner) {
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
        System.out.print("Enter the number of random numbers to generate: ");
        int count = scanner.nextInt();
    
        Random random = new Random();
        System.out.print("Random numbers: ");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.print(randomNumber + " ");
        }
        System.out.println();
    }
    public static void simpleBankingSystem(Scanner scanner) {
        double balance = 0;
        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited: " + deposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrew: " + withdraw);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
    public static void simulateVotingSystem(Scanner scanner) {
        Map<String, Integer> candidates = new HashMap<>();
        candidates.put("Candidate A", 0);
        candidates.put("Candidate B", 0);
        candidates.put("Candidate C", 0);
    
        while (true) {
            System.out.println("Candidates: ");
            for (String candidate : candidates.keySet()) {
                System.out.println(candidate);
            }
    
            System.out.print("Enter your vote (or type 'exit' to finish): ");
            String vote = scanner.next();
            if (vote.equalsIgnoreCase("exit")) {
                break;
            }
    
            if (candidates.containsKey(vote)) {
                candidates.put(vote, candidates.get(vote) + 1);
            } else {
                System.out.println("Invalid candidate.");
            }
        }
    
        System.out.println("Voting results:");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
    public static void simpleLibraryManagementSystem(Scanner scanner) {
        List<String> books = new ArrayList<>();
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. List Books");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
    
            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String addBook = scanner.nextLine();
                    books.add(addBook);
                    System.out.println("Added: " + addBook);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String removeBook = scanner.nextLine();
                    if (books.remove(removeBook)) {
                        System.out.println("Removed: " + removeBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.println("Books in library:");
                    for (String book : books) {
                        System.out.println(book);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
    public static void simulateATM(Scanner scanner) {
        double balance = 0;
        int pin = 1234;
        int attempts = 0;
    
        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int enteredPin = scanner.nextInt();
            if (enteredPin == pin) {
                while (true) {
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("0. Exit");
                    System.out.print("Choose an option: ");
                    int choice = scanner.nextInt();
    
                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double deposit = scanner.nextDouble();
                            balance += deposit;
                            System.out.println("Deposited: " + deposit);
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdraw = scanner.nextDouble();
                            if (withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("Withdrew: " + withdraw);
                            } else {
                                System.out.println("Insufficient funds.");
                            }
                            break;
                        case 3:
                            System.out.println("Current balance: " + balance);
                            break;
                        case 0:
                            return;
                        default:
                            System.out.println("Invalid option.");
                            break;
                    }
                }
            } else {
                attempts++;
                System.out.println("Incorrect PIN. Attempts left: " + (3 - attempts));
            }
        }
        System.out.println("Account locked due to too many incorrect PIN attempts.");
    }
    public static void calculateCompoundInterest(Scanner scanner) {
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of years: ");
        int t = scanner.nextInt();
    
        double amount = principal * Math.pow((1 + (rate / 100) / n), n * t);
        System.out.println("Compound Interest: " + (amount - principal));
        System.out.println("Total Amount: " + amount);
    }
    public static void simpleStudentGradingSystem(Scanner scanner) {
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
    
        Map<String, Double> grades = new HashMap<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter grade for " + name + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            grades.put(name, grade);
        }
    
        System.out.println("Student Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void convertRomanNumeralsToInteger(Scanner scanner) {
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase();
        Map<Character, Integer> romanToInt = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );
        int result = 0;
        int prevValue = 0;
    
        for (char ch : roman.toCharArray()) {
            int value = romanToInt.getOrDefault(ch, 0);
            result += value;
            if (value > prevValue) {
                result -= 2 * prevValue;
            }
            prevValue = value;
        }
    
        System.out.println("Integer value: " + result);
    }
    public static void simpleToDoListApplication(Scanner scanner) {
        List<String> toDoList = new ArrayList<>();
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
    
            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Added task: " + task);
                    break;
                case 2:
                    System.out.print("Enter task to remove: ");
                    String removeTask = scanner.nextLine();
                    if (toDoList.remove(removeTask)) {
                        System.out.println("Removed task: " + removeTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 3:
                    System.out.println("To-Do List:");
                    for (String item : toDoList) {
                        System.out.println(item);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
                                            



    public static void findAllPrimeNumbers(Scanner scanner) {
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();
    
        System.out.print("Prime numbers: ");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
    









}






