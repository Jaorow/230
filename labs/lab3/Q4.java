package labs.lab3;


public class Q4 {
    public static void main(String[] args){
        
        
        System.out.println(noMultipleOf5(new int[]{3, 6, 9}));
        
        
    }
    public static boolean noMultipleOf5(int[] values){
        for (int value : values) {
            if (value%5==0) {
                return false;
            }
        }
        return true;
    }

}




