import java.awt.Point;

public class tester {
    public static void main(String[] args) {
        MySubSquare t1 = new MySubSquare();
        MySubSquare t2 = new MySubSquare(new Point(20, 20), new Point(40, 40));
        System.out.printf("%s, perimeter=%.2f, area=%.2f\n", t1.toString(), t1.getPerimeter(), t1.getArea());
        System.out.println(t1);
        System.out.printf("%s, perimeter=%.2f, area=%.2f\n", t2.toString(), t2.getPerimeter(), t2.getArea());
        System.out.println(t2);
    
    
    }
}
