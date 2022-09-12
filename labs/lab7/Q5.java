import java.io.*;
import java.util.*;
class Q5{
    public static void main(String[] args) {
        System.out.println(getWordsList("text.txt", 5));
    }

    public static ArrayList<String> getWordsList(String filename, int desiredLength){
        Scanner fileInput = null;
        ArrayList<String> arr = new ArrayList<>();

        try {
            fileInput = new Scanner(new File(filename));
            while (fileInput.hasNextLine()) {
                String sen = fileInput.nextLine();
                String[] li = sen.split(" ");
    
                for (String word : li) {
                    word = word.toLowerCase();
                    if (word.length() == desiredLength && ! arr.contains(word)) {
                        arr.add(word);
                    }
                }
            }
 

        } catch (IOException e) {
            System.out.printf("ERROR: The file '%s' does not exist.\n", filename);
            return arr;

        } finally {
            if (fileInput!= null)
                fileInput.close();
        }
        Collections.sort(arr);
        return arr;
    }
 
}