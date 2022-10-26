import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Repeats {
    public static void main(String[] args) {
        String[] words = new String[] {"bb", "ab", "ba", "aa", "aaa", "ab", "bb", "bbb", "aa", "ab", "xx"};
ArrayList<String> result = getRepeats(words);
System.out.println(result);
    }

    public static ArrayList<String> getRepeats(String[] words){
        ArrayList<String> s = new ArrayList<String>();
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (i != j) {
                        if (words[i].equals(words[j])) {
                            if (! s.contains(words[i])) {
                                s.add(words[i]);
                            }
                        }
                    }
                }
            }
        Collections.sort(s);
        return s;
    }
}