package day5_minor_test2;
public class GradeAveragingProgram {
       /*
     * o Task: Develop a program that calculates the average of multiple grades and
     * determines the final letter grade.
     * o Objective: Practice working with loops, arrays, and conditional logic.
     * o Skills: Loops, arrays, conditional statements
     */

    public static void main(String[] args) {
        int[] grades = { 85, 92, 78, 88, 95 };
        double average = calculateAverage(grades);
        char letterGrade = calculateLetterGrade(average);
        System.out.printf("Average Grade: %.2f%n", average);
        System.out.println(" Grade: " + letterGrade);
    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static char calculateLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
