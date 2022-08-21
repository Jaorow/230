import java.awt.*;
public class tester {
    public static void main(String[] args) {
        AnimationViewer viewer = new AnimationViewer();
        viewer.createNewShape(10, 20);  //create a rectangle
        viewer.createNewShape(20, 30);  //create a square
        viewer.createNewShape(30, 40);  //create an oval
        viewer.createNewShape(40, 50);  //create a kite
        viewer.paintComponent(null);
        viewer.paintComponent(null);
    }
}
