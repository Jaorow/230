package labs.lab3;


public class Q3 {
    public static void main(String[] args){


        
        System.out.println(getSumPositiveEven(new int[]{-2,4,-6,8,-10,5}));

}
    public static int getSumPositiveEven(int[] numbers){
        int sum = 0;
        for (int i : numbers) {
            if (i%2==0 && i>0) {
                sum += i;
            }
            
        }
        return sum;
    }

}
