package labs.lab3;

public class Q1 {
    public static void main(String[] args){

        int[] numbers = new int[]{1, 14, 16, 15, 24, 66, 6, -3};
        System.out.println(getIndexOfSmallestEven(numbers));
    
    }

    

    public static int getIndexOfSmallestEven(int[] numbers){
        if (numbers.length > 0){

            int min = numbers[0];
            int index = 0;

            for (int i = 0; i < numbers.length; i++) {

                if (min%2!=0 && numbers[i]%2==0) {
                    min = numbers[i];
                    index = i;

                }

                if (numbers[i] < min && numbers[i]%2==0) {
                        min = numbers[i];
                        index = i;
                }
            }
            if (min%2!=0) {
                return -1;
            }else{return index;}

        }else{return -1;}
    }
}