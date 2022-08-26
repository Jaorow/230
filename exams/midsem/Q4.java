public class Q4 {
    public static void main(String[] args) {
        String data = getSecretCode("standard", new int[]{1, 3, 2});
        System.out.println(data);
        System.out.println(getSecretCode("hello", new int[]{2, 4}));
    }

    public static String getSecretCode(String word, int[] positions){
        String[] wordSplit = word.split("");
        String total = "";
        for (int i : positions) {
            total += wordSplit[i-1];
        }
        return total;
    }
}
