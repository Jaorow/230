import java.awt.*;

public class tester {
    public static void main(String[] args) {
        // AnimationViewer p  = new AnimationViewer();
        // NestedShape s = p.getRoot();
        // p.addShapeNode(s);
        // p.setCurrentShapeType(ShapeType.NESTED);
        // p.addShapeNode(s);
        // NestedShape n1 = (NestedShape)(p.getChild(s,1));
        // p.addShapeNode(n1);
        // devider();

        AnimationViewer p2  = new AnimationViewer();
        NestedShape s2 = p2.getRoot();

        p2.setCurrentShapeType(ShapeType.NESTED);
        p2.addShapeNode(s2);
        NestedShape n2 = (NestedShape)(p2.getChild(s2,0));
        p2.setCurrentShapeType(ShapeType.RECTANGLE);
        p2.addShapeNode(n2);
    }
    public static void devider(){
        System.out.println("=================================================");
        
    }
}
