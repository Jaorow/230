public class Q2 {
    public static void main(String[] args) {
      int result = getSumSquares(new String[]{"1", "2", "3", "4", "two", "2"});
System.out.printf("The result is %d.", result );
    }
    public static int getSumSquares(String[] str){
        int total = 0;
        for (String i : str) {
            try {
                total += Math.pow(Integer.parseInt(i), 2);
            } catch (Exception e) {System.out.printf("");
            }
        }   
        return total;
    }
}

