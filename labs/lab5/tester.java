import java.awt.*;
public class tester {
    public static void main(String[] args) {
        MyTrapezoid t1 = new MyTrapezoid();
        MyTrapezoid  t2 = new MyTrapezoid(new Point(20, 20), new Point(40, 20), new Point(5, 60), new Point(45, 60));
        System.out.printf("%s, perimeter=%.2f, area=%.2f\n", t1.toString(), t1.getPerimeter(), t1.getArea());
        System.out.printf("%s, perimeter=%.2f, area=%.2f\n", t2.toString(), t2.getPerimeter(), t2.getArea());
        System.out.printf("height=%.2f, height=%.2f", t1.getHeight(), t2.getHeight());
        System.out.printf("%.2f, %.2f, %.2f %.2f\n", t2.getSideA(), t2.getSideB(), t2.getSideC(), t2.getSideD());
    }

    // Enemy[] objects = new Enemy[]{new Vampire("Dick"), new Fighter("Louis")};
    // displayAll(objects);
// }
    // public static void displayAll(Enemy[] array){
        
    // }


}
