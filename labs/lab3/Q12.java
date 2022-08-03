package labs.lab3;

import java.util.*;
public class Q12 {
    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Collections.addAll(arrayList, -3, -5, 6, 24, -7, -9, 1, 8, 28, -11);
        duplicateEvens(arrayList);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Collections.addAll(arrayList2, 2, 4, 6);
        duplicateEvens(arrayList2);
        System.out.println(arrayList2);


    }
    public static void duplicateEvens(ArrayList<Integer> numbers){
        int numb = 0;
            for (int i = 0; i < numbers.size(); i++) {

                if (numbers.get(i)%2==0) {
                    numb = numbers.get(i);
                    numbers.add(i,numb);
                    i++;
                }
            }

    }

}