import java.awt.*;
public class Q9 {
    public static void main(String[] args) {
        System.out.println(getCount(new String[]{"hello", "world", "hello"}, "hello"));
        Point[] array = new Point[] {new Point(10, 20), new Point(20, 30), new Point(30, 40), new Point(10, 20), new Point(20, 10), new Point(10, 20)};
        System.out.println(getCount(array, new Point(10, 20)));
    }
    public static <T> int getCount(T[] arr, T target){
        int count = 0;
            for (T t : arr) {
                if (t.equals(target)) {
                    count ++;
                }
            }
        return count;
        
    }
}
