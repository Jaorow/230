package labs.lab3;

import java.util.*;

public class Q5 {
    public static void main(String[] args){


        int[] result = createDigitsArray(234);
        System.out.println(Arrays.toString(result));


}
    public static int[] createDigitsArray(int result){
        String number=String.valueOf(result);
        String[] split = number.split("");

        int mux = 1;
        int numb = 0 ;
        int ans[]; 
        ans = new int[number.length()];

        for (int i = split.length-1; i > -1; i--) {
            numb = Integer.parseInt(split[i]);
            
            ans[i] = numb*mux;
            mux *= 10;
        }

    return ans;
    }

}