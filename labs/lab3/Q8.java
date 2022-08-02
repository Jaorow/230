package labs.lab3;


public class Q8 {
    public static void main(String[] args){

        int[][] nums = {{0, 1, 2, 3}, {2, 4, 116, 8}, {3, 6, 9, 12}, {24, 65, 23, 7}};
        System.out.println(getIndexOfLargestColumnSum(nums));
        int[][] nums2 = {{3, 4, 5, 23}, {2, 4, 16, 1}, {3, 6, 9, 2}, {13, 6, 7, 12}};
        System.out.println(getIndexOfLargestColumnSum(nums2));
        int[][] nums3 = {{ 1, 2, 3, 4, 5 }, { 5, 1, 4, 2, 6}, { 7, 8, 9, 1, 2 }, { 0, 6, 3, 4, 12 }, { 9, 7, 3, 4, 1}};
        System.out.println(getIndexOfLargestColumnSum(nums3));

}
    public static int getIndexOfLargestColumnSum(int[][] nums){
        int sum = 0,index = 0,max = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[j][i];

            }

            if (sum > max){
                max = sum;
                index = i;
            }
        }        
        return index;
    }

}
