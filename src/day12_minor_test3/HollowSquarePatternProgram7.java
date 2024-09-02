package day12_minor_test3;

public class HollowSquarePatternProgram7 {

    // Program - 7:Hollow Square Pattern

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            
            for (int j = 1; j <=5; j++) {
                
                if (i==1 || i==5 || j==1|| j==5) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
