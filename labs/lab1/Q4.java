package labs.lab1;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter x1: ");
        double x1 = input.nextDouble();
        
        System.out.println("Enter y1: ");
        double y1 = input.nextDouble();
        
        System.out.println("Enter x2: ");
        double x2 = input.nextDouble();

        System.out.println("Enter y2: ");
        double y2 = input.nextDouble();

        // double x1 = 1.5;
        // double y1 = -3.4;
        // double x2 = 4;
        // double y2 = 5;


        double result = Math.pow((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)),0.5);

        
        System.out.printf("The distance between the two points is %.2f.\n",result);
        input.close();
 } 
} 