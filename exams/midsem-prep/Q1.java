import java.util.*;

public class Q1 {
   public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter your username:");
           
           String s = input.nextLine();

           System.out.printf("Hello %s, how are you?\n",s.toUpperCase());
    }
       

   }
}

