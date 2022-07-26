package labs.lab2;

import java.util.*;

public class Q5 {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight (kg):");
        double kg = input.nextDouble();
        System.out.println("Enter height (feet):");
        double feet = input.nextDouble();
        System.out.println("Enter height (inches):");
        double inches = input.nextDouble();
        
        // double kg = 62, feet = 5, inches = 10;

        double meters = ((feet*12) + inches) * 0.0254;
        double bmi = kg/Math.pow(meters, 2);
        String message = "NULL";
        
        if (bmi < 18.5) {
            message = "Underweight";
        }
        if (18.5 <= bmi & bmi < 25) {
            message = "Normal";
        }
        if (25 <= bmi & bmi < 30) {
            message = "Overweight";
        }
        if (30<= bmi){
            message = "Obese";
        }

        System.out.printf("BMI is %.02f, %s\n",bmi,message);
        input.close();   
    }
}