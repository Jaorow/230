package labs.lab2;

import java.util.Scanner;
public class Q0 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter principle:");
    double principle = input.nextDouble();
    System.out.println("Enter time (number of years):");   
    int years =  input.nextInt();
    System.out.println("Enter rate:");         
    double rate = input.nextDouble();

    double interest = (principle*years*rate)/100;
    System.out.printf("Simple Interest = $%.2f",interest);
    input.close();
}
}