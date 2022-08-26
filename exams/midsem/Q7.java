import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        System.out.println(getLeftPartition(new int[]{10, 8, 7, 14, 2, 19, 15, 5})); 
        System.out.println(getLeftPartition(new int[]{10, 5, 3, 2})); 
        System.out.println(getLeftPartition(new int[]{10, 15, 13, 12}));
    }
    public static ArrayList<Integer> getLeftPartition(int[] numbers){
        ArrayList<Integer> array = new ArrayList<Integer>();

    int pivot = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
        if(numbers[i] < pivot){array.add(numbers[i]);}
    }

        return array;
    }
}

