package labs.lab2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        double sum = 0;
        for (double i = 1; i < num+1; i++) {

            // System.out.println("1/"+i+"=");
            // this took so much debuging coz i was an interger !! 
            // System.out.println(1/i);

            sum += 1/i;
            // System.out.println(sum);
            
        }
    
        System.out.printf("The sum of thie series is %.02f.\n",sum);
        
    input.close();
    }
}
