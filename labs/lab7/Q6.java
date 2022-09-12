import java.io.*;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        encryptText("text.txt");
    }
    public static void encryptText(String filename){
        Scanner fileInput = null;

        try {
            fileInput = new Scanner(new File(filename));
            while (fileInput.hasNextLine()) {
                String sen = fileInput.nextLine();
                String[] li = sen.split("");
                for (String string : li) {
                    if (! string.equals(" ")) {
                        char i = string.charAt(0);
                        System.out.printf("%c",i+1);
                    } else { System.out.printf(" ");
                    }
             
                    
                }
    
                
            }
 

        } catch (IOException e) {
            System.out.printf("ERROR: The file '%s' does not exist.\n", filename);

        } finally {
            if (fileInput!= null)
                fileInput.close();
        }
    }
}
