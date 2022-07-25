package labs.lab2;

import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.println("Enter the first word:");
        String firstWord = input.nextLine();
        String[] first = firstWord.split("");
        int firstLen = firstWord.length();

        System.out.println("Enter the second word:");
        String secondWord = input.nextLine();
        String[] second = secondWord.split("");
        int secLen = secondWord.length();

        String answer = "false";

        
        if (first[firstLen-1].equals(second[secLen-1]) ){
            if (secLen%2==0) {answer = "true";}
            if (firstLen%2==0) {answer = "true";}
            if (secLen%2==0 & firstLen%2==0) {answer = "false";}
        }
        System.out.println(answer);

   
    
    }

}