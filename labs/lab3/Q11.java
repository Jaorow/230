// package labs.lab3;

import java.util.*;

public class Q11 {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Collections.addAll(arrayList, 476, 1656, -1000, 1308, 774, -1175, 1195, 1602, -2800);
        removeExtremes(arrayList);
        System.out.println(arrayList);



}
    public static void removeExtremes(ArrayList<Integer> numbers){
        
        
        for (int i = numbers.size()-1; i >= 0; i--) {
            
            if (numbers.get(i) > 1000 | numbers.get(i) < -1000) {
                
                numbers.remove(i);
            }
        }

    }

}