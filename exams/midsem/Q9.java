import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        ArrayList<Integer> a_list = new ArrayList<>(Arrays.asList(476, 1656, -1000, 1308, 774, -1175, 1195, 1602, -2800, 999));
removeExtremes(a_list);
System.out.println(a_list);
    }
// array[i] > 1000 || array[i] < -1000
    private static void removeExtremes(ArrayList<Integer> array) {
        for (int i = array.size(); i >= 0; i--) {
            if(array.get(i) > 1000 || array.get(i) < -1000) {
                array.remove(i);
            }
        }
    }
}
