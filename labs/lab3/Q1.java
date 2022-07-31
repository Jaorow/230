package labs.lab3;

public class Q1 {
    public static void main(String[] args){

            int[] numbers = new int[]{51, 65, 66, 11, 80, 10, 9};
            System.out.println(getIndexOfSmallestEven(numbers));
    
    }

    

    public static int getIndexOfSmallestEven(int[] numbers){
    if (numbers.length > 0){
        int min = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                if (numbers[i]%2==0){
                    index = i;
                }
            }
        }
        return index;
    }else{
    
    return -1;
    }

    }
    
}
