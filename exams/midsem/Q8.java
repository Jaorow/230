import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        int[] array = new int[]{476, 1656, -1000, 1308, 774, -1175, 1195, 1602, -2800, 999};
clearExtremes(array);
System.out.println(Arrays.toString(array));
    }

    private static void clearExtremes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1000 || array[i] < -1000) {
                array[i] = 0;
            }
        }
    }
}
