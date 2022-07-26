package labs.lab2;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
        // System.out.println("Enter the first number:");
        // int no1 = input.nextInt();
        // System.out.println("Enter the last number");
        // int no2 = input.nextInt();

        int no1 = 20,no2 = 40;

        int total = 0;
        while (no1<=no2){
            if (no1%3==0 & no1%7!=0){
            total += no1;
            System.out.println(no1);
            }
            no1 ++;

            
            
        }
        
        System.out.printf("The sum is: %d\n",total);
        // input.close();

    }
}
	