import java.util.ArrayList;

// package labs.lab3;

public class Q9 {
    public static void main(String[] args){

        ArrayList<Integer> result = getPositiveEvens(new int[]{1, 2, -3, -4, 5, 6, 7, 8, 9, 10, -1, -2});
        System.out.println(result);
        ArrayList<Integer> result2 = getPositiveEvens(new int[]{5, 1, -2, 91, 3, -26, -3, -7});
        System.out.println(result2);
        ArrayList<Integer> result3 = getPositiveEvens(new int[]{33,-44,55,66,77,88,12,-76,43});
        System.out.println(result3);
}
    public static  ArrayList<Integer> getPositiveEvens(int[] numbers){
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : numbers) {
            if (i>0 && i%2==0) {
                list.add(i);
            }
        }
        return list;
    }

}
