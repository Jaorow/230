import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static int getNumber() {
	Scanner input = new Scanner(System.in);
	int number = 0;
    boolean lever = true;
	while (true) {
        System.out.println("Enter a number which is divisible by 3 but not 5:");
        number = input.nextInt();

        if (number%3==0 && number%5!=0) {
            return number;
        }
    }

    }
}
