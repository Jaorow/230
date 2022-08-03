package labs.lab3;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args){


        int[][] result = generate2DArray(654);
        for (int[] array: result) System.out.println(Arrays.toString(array));


}
    public static int[][] generate2DArray(int number){
        String split = String.valueOf(number);

        int three = Integer.parseInt(split),
                two = Integer.parseInt(split.substring(0,2)),
                one = Integer.parseInt(split.substring(0, 1));
        
                

        int[][] name = {{three},{three,two},{three,two,one}};
        return name;
    }

}

// oldString.substring(0, 10);



// int t = split.length();
// for (int i = 0; i < split.length(); i++) {
          
//     for (int k = 0; k < split.length(); k++) {
        
//         for (int j = split.length(); j >= 0; j--) {
//             System.out.println(split.substring(0, j));
//         }
    
// }   
    
// }