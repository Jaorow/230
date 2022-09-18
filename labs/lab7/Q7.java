import java.io.*;
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(getSmallestEven("text.txt"));
    }
    public static int getSmallestEven(String filename){
        Scanner fileInput = null;
        int max = 999;

        try {
            fileInput = new Scanner(new File(filename));
            while (fileInput.hasNextLine()) {
                    String sen = fileInput.nextLine();
                    String[] li = sen.split(",");
                    for (String string : li) {
                        int num = Integer.parseInt(string);
                        if (num < max && num%2==0){ max = num; }
                    }    
            }
            
        } catch (IOException e) {
            System.out.printf("ERROR: The file '%s' does not exist.\n", filename);
            return max;
        } finally {
            if (fileInput!= null)
                fileInput.close();
        }
        return max;
    }
}
