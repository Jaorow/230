package labs.lab1;
import java.time.LocalTime;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter a time (HH:mm:ss):");
        String sTime = input.nextLine();
        // String sTime = "04:57:37";
        LocalTime time = LocalTime.parse(sTime);
        
        System.out.printf("Hour: %d\nMinute: %d\nSecond: %d\nIt will be: %s\n",time.getHour(),time.getMinute(),time.getSecond(),time.plusMinutes(10));
        input.close();

    }
}