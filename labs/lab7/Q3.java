import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int in = 0;
            int max = -999;
            while (in != -1) {
                try {
                    System.out.println("Enter a positive integer:");
                    
                    in = input.nextInt();
                    if (in > max) {max = in;} 
                } catch (InputMismatchException e) {
                    if (max == -999) {System.out.println("ERROR: Invalid input!");
                     System.out.printf("No valid input entered!\n"); } 
                    else {System.out.println("ERROR: Invalid input!"); System.out.printf("The maximum integer is %d.\n", max); }
                    return;
                }
            }
            if (max == -999) {
                System.out.printf("No valid input entered!\n"); 

            } else {
                
            System.out.printf("The maximum integer is %d.\n", max); 
            }
        }
        
    }
}
