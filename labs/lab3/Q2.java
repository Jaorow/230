package labs.lab3;


public class Q2 {
    public static void main(String[] args){


        String[] words =  new String[]{"cat", "the", "at", "bag", "let", "out", "can", "of", "tail", "by"};
        System.out.println(getFreqShortestLength(words));


}
public static int getFreqShortestLength(String[] words){
    if (words.length > 0){
        int len = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < len){ len = words[i].length();}
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count ++;
            }
        }

        return count;
    }else{return 0;}
}

}