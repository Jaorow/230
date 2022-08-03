package labs.lab1;

import java.util.Scanner;
public class Q7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = input.nextLine();
        
        // String username = "abcd934";
        String str[] = username.split("");
        int size = username.length();
        int sum = Integer.parseInt(str[size-3])+Integer.parseInt(str[size-2])+Integer.parseInt(str[size-1]);
     
        System.out.printf("The sum is %d.\n",sum);
        input.close();

 } 
} 