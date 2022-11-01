import java.util.ArrayList;

public class Q2 {
    public static ArrayList<String> getWordsStartsWithVowel(String[] words){
        String vowles = "aeiou";
        ArrayList<String> a = new ArrayList<String>();

        for (String s : words) {
                if (vowles.contains(s.toLowerCase().substring(0,1))) {
                    if (!(a.contains(s.toLowerCase()))) {
                        a.add(s.toLowerCase());
                    }
                }
            }
            return a;
        }
            
        
    }

