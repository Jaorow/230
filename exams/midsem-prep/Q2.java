
public class Q2 {

    public static void main(String[] args) {
System.out.println(reverse_substring("bodybuilding", 2, 5));    System.out.println(reverse_substring("friendship", 1, 4));}



    public static String reverse_substring(String word, int startIndex, int endIndex){
        String w = word.substring(startIndex, endIndex);
        String first = word.substring(0,startIndex);
        String last = word.substring(endIndex);

        StringBuffer rev = new StringBuffer(w);
        // System.out.println("String buffer = " + w);

        return String.format("%s%s%s", first,rev.reverse(),last);
    
    }
}
