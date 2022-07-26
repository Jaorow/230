package labs.lab2;

import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        String[] list = sentence.split("");
        System.out.println("Enter a character for counting:");
        String regex = input.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (list[i].equals(regex)){
            count += 1;
            }
        }
      System.out.printf("The number of occurrences of \"%s\" is %d.\n",regex,count);
      
      input.close();
    }}