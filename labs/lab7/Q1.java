import java.util.InputMismatchException;
import java.util.*;

public class Q1 {
    public static void main(String[] args)  {
		try (Scanner input = new Scanner(System.in)) {
            try {
                System.out.println("Enter a numerator:");
                int num = input.nextInt();
                System.out.println("Enter a divisor");
                int div = input.nextInt();
                System.out.printf("%d / %d = %d\n",num,div,num/div);
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Invalid input!");
            } catch (Exception e) {
                System.out.printf("ERROR: %s\n",e.getMessage());
            }
        }
    }       
}
