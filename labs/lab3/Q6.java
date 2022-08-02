package labs.lab3;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args){


        int[] array = new int[]{9, 21, -6, 34, 29, -1, 4};
        replaceNegativesByZero(array);
        System.out.println(Arrays.toString(array));


}
    public static int[] replaceNegativesByZero(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<0) {
                numbers[i] = 0;
            }
        }

    return numbers;

    }

}
