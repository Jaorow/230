package labs.lab2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of sides:");
        int sides = input.nextInt();
        input.close();
        String shape = "NULL";
        
        if (sides == 3){ shape = "triangle";}

        if (sides == 4){ shape = "quadrilateral";}

        if (sides == 5){ shape = "pentagon";}

        if (sides == 6){ shape = "hexagon";}

        if (sides == 7){ shape = "heptagon";}

        if (sides == 8){ shape = "octagon";}

        if (sides == 9){ shape = "nonagon";}

        if (sides == 10){ shape = "decagon";}
        
        if (shape == "NULL") {
            System.out.println("That number of sides is not supported by this program.");
            
        } else {
            System.out.printf("The number of sides is %d and it is a %s.\n",sides,shape);
            
        }   
    }
}