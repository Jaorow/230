import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] array3 = {-7, 2, 3, 8, 6, 6, 75, 38, 3, 2};
System.out.println(Arrays.toString(getSquared(array3)));
System.out.println("[49, 4, 9, 64, 36, 36, 5625, 1444, 9, 4]");

    }


    public static int[] getSquared(int[] numbers) {
        int[] numbers2 = new int[numbers.length];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = (int) Math.pow(numbers[i],2);
        }
        return numbers2;
    }
}
