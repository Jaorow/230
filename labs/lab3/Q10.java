package labs.lab3;
import java.util.*;



public class Q10 {
    public static void main(String[] args){
        ArrayList<Double> a_list = new ArrayList<Double>();
        Collections.addAll(a_list,9.5, 10.5, 7.1, 2.75, 4.5, 8.2, 38.19);
        roundToWholeNumbers(a_list);
        System.out.println(a_list);

}
    public static void roundToWholeNumbers(ArrayList<Double> numbers){
        double holder = 0 ;
        for (int i = 0; i < numbers.size(); i++) {
            holder = Math.round(numbers.get(i));
            numbers.set(i, holder);
        }

    }

}