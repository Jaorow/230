import java.util.ArrayList;

class zeros{
    public static void removeNegativesAndZeros(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) <= 0) {
                numbers.remove(i);
                i -- ;
            }
        }
    }
}