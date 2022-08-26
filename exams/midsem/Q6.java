public class Q6 {
    public static void main(String[] args) {
        System.out.println(no_palindromes(new String[]{"input", "output"}));
        System.out.println(no_palindromes(new String[]{"input", "madam", "output"}));
        System.out.println(no_palindromes(new String[]{"kayak", "madam", "peep"}));
    }

    public static boolean no_palindromes(String[] values){
        for (String string : values) {
            StringBuffer rev = new StringBuffer(string);
            if (string.equals(rev.reverse().toString()) ) {
                return false;
            }
        }return true;
    }
}
