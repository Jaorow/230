import java.util.Scanner;
public class Q1{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter a height in centimetres:");
        double num = input.nextFloat();

        double totalInches = num / 2.54;
        int feet = (int) Math.floor(totalInches/12);
        double In = totalInches - (feet*12);

        System.out.printf("%.2fcms is %d feet %.2f inches.",num, feet, In);
        
    }
}