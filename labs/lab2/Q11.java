package labs.lab2;

import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = input.nextInt();
        int count = 1;
        
        for (int i = 1; i < n+1; i++) {
            
            for (int j = 0; j < i; j++) {
                if (count <10){
                System.out.printf("0%d ",count);
            }else{
                System.out.printf("%d ",count);
            }
            count +=1;

            }
            System.out.println();
            
        }

     input.close();
    }
}
