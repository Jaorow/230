import java.util.Scanner;

public class Q10{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words:");
        String words = input.nextLine();
        String list[] = words.split(" ");
        String word1 = list[0];
        String word2 = list[1];

        // String word1 = "hello";
        // String word2 = "world";
        int w1_length = word1.length();
        int w2_length = word2.length();
        // answer = hwlrod
        String l1[] = word1.split("");
        String l2[] = word2.split("");

        String w1_1 = l1[0];
        String w2_1 = l2[0];

        
        String w1_2 = l1[Math.floorDiv(w1_length, 2)];
        String w2_2 = l2[Math.floorDiv(w2_length, 2)];

        String w1_3 = l1[w1_length-1];        
        String w2_3 = l2[w2_length-1];

        System.out.printf("The password is %s%s%s%s%s%s\n",w1_1,w2_1, w1_2,w2_2, w1_3,w2_3);
        
    }        

}