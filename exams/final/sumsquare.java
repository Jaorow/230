public class sumsquare {
    public static void main(String[] args) {
        
    }
    public static int getSumSquareOverTarget(int[] numbers, int target){
        int sum = 0;
        for (int i : numbers) {
            if (Math.pow(i, 2) > target) {
                sum += i;
            }
        }
        return sum;
    }
}
