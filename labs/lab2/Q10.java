package labs.lab2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        String mes = "";
        for (int i = 1; i < num; i++) {
            if (i != 1 & i!=num) {
                if (num%i==0) {
                    mes = "NOT ";
                }
            } 
        }
        
    System.out.printf("%d is %sa prime number.\n",num,mes);
    
    input.close();
    }
}