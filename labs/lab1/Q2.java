package labs.lab1;

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter principle:");
    double p = input.nextDouble();

    System.out.println("Enter time (number of years):");
    double t = input.nextDouble();

    System.out.println("Enter rate:");
    double r = input.nextDouble();

    double answer = (p*t*r)/100;

    System.out.printf("Simple Interest = $%.2f",answer);
    
    input.close();

  }
}