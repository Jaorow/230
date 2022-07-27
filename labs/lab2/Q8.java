package labs.lab2;

import java.util.*;

public class Q8 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Enter an even number between 1 and 12 (inclusive):");
       int num = input.nextInt();
       
       while (!(num%2==0 &(1<num & num<12))){
            System.out.println(num%2==0 &(1<num & num<12));
            System.out.println("Invalid number.");
            
            System.out.println("Enter an even number between 1 and 12 (inclusive):");
            num = input.nextInt();
       }
    
       System.out.println("Good job.");
       input.close();
   }
}
