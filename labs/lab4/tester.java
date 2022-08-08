public class tester {
    public static void main(String[] args) {
        MyParallelogram p = new MyParallelogram();
System.out.println(p);
MyParallelogram p2 = new MyParallelogram(5, 13, 30);
System.out.println(p2);
System.out.println(p == p2);
System.out.println(p.equals(p2));
System.out.println(p);
System.out.printf("%.2f, %d\n", p.getArea(), p.getPerimeter());
    }
}
