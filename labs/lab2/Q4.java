package labs.lab2;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter a password:");
        
        String pass = input.nextLine();
        int len = pass.length();
        String message = "NULL";
        boolean hasNum = false;

        if (len >=  6) {
            for (int i = 0; i < len; i++) {
                if(Character.isDigit(pass.charAt(i))){
                    hasNum = true;
                }else{message = "The password is not strong enough.";}
            
            }

            if (pass.contains("*")){
                if (hasNum) {
                    message = "Good job.";
                }
                
                }else{
                message = "The password is too simple." ;
                
                }
        }else{
            message = "The password is too short.";
        }
        System.out.println(message);
        input.close();
    }
}