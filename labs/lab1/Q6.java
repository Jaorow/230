package labs.lab1;
import java.time.LocalDate;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a date (yyyy-mm-dd):");
        String date = input.nextLine();
        

        // String date = "2021-12-18";
        LocalDate dates = LocalDate.parse(date);


    System.out.printf("Year: %s\nMonth: %s\nDay: %s\nThe date of the next day is: %s\n",dates.getYear(),dates.getMonth(),dates.getDayOfMonth(),dates.plusDays(1));
            
    input.close();



 } 
} 