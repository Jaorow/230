import java.util.*;
public class Q5 {

    public static void main(String[] args) {
        String[] words = {"now", "it", "is", "autumn", "the", "Tortoise", "eggs", "are", "fully", "developed", "and", "ready", "to", "hatch"};
ArrayList<String> words_list = new ArrayList<String>();
Collections.addAll(words_list, words);
removeWordEndingWithe(words_list);
System.out.println(words_list);
    }
    public static void removeWordEndingWithe(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
                String string = words.get(i);
            if (string.substring(string.length()-1).equals("e") ) {
                // System.out.println(string);
                words.remove(i);
                i--;
        }
        }
    }
}
