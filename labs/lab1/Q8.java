package labs.lab1;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = input.nextLine();

        System.out.println("Enter your surname:");
        String last = input.nextLine();

        System.out.println("Enter a number between 1 and 999 (both inclusive):");
        int num = input.nextInt();
        


        // String first = "Damir";         
        // String last = "Azhar";
        // int num = 1;

        first = first.toLowerCase();
        String listFirst[] = first.split("");
        last = last.toLowerCase();
        String listLast[] = last.split("");
        
        
        System.out.printf("Your username is: %s%s%s%s%03d\n",listFirst[0],listLast[0],listLast[1],listLast[2],num);
        
        
        
        input.close();

 } 
} 