
public class Q11 {
    public static void main(String[] args) {
        MyQuadrilateral[] objects = new MyQuadrilateral[]{new MyRectangle(), new MySquare(), new MyParallelogram(), new MyTrapezoid()};
        displayAllInfo(objects);
    }

    public static void displayAllInfo(MyQuadrilateral[] array){
        for (MyQuadrilateral myQuadrilateral : array) {
            System.out.println(myQuadrilateral);
        }
    }
}
