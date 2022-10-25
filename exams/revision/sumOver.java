public class sumOver{
    public static void main(String[] args) {
        int[][] source = {{2, 4, 16, 80, 27}, {1, 4, 120, 18, 77}, {20, 14, 70, 8, 130}};
        System.out.println(sum_over(source , 50));

        int[][] source2  = {{2, 4, 16, 80, 27}, {1, 4, 120, 18, 7}, {20, 14, 70, 8, 130}};
System.out.println(sum_over(source2 , 50));  
    }
    public static int sum_over(int[][] numbers, int target) {
        int sum = 0;
        for (int[] is : numbers) {
            for (int num : is) {
                if (num >= target){
                    sum += num;
                }
            }
        }
        return sum;
    }
}