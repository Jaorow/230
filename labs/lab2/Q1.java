package labs.lab2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first integer:");
        int n1 = input.nextInt();

        System.out.println("Enter the second integer:");
        int n2 = input.nextInt();

        System.out.println("Enter the third integer:");
        int n3 = input.nextInt();

        System.out.println("Enter the fourth integer:");
        int n4 = input.nextInt();
        input.close();
        int lar = 0;

        if (n1>lar){lar = n1;}
        if (n2>lar){lar = n2;}
        if (n3>lar){lar = n3;}
        if (n4>lar){lar = n4;}

        
        System.out.printf("The maximum is %d.\n",lar);
        
        
    }
}