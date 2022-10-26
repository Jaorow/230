import java.util.*;

public class removeDuplicatedAdjacent {
    public static void main(String[] args) {
        ArrayList<String> a_list = new ArrayList<String>(Arrays.asList("apple", "apple", "apple"));
        removeDuplicateAdjacent(a_list);
        System.out.println(a_list);
    }
    public static void  removeDuplicateAdjacent(ArrayList<String> words){
        for (int i = 0; i < words.size(); i++) {
            try {
                if (words.get(i).equals(words.get(i+1))) {
                    words.remove(i);
                    i --;
                }
            } catch (IndexOutOfBoundsException e) { continue; }
        }
    }
}
