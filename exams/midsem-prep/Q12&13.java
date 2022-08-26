interface Measurable {
  public double getMeasure();
}

import java.awt.*;

class MyLine implements Measurable {
    private Point pt1, pt2 ;
    public MyLine() {this(0,0,0,0);}
    public MyLine(int x1, int y1, int x2, int y2) {
    pt1 = new Point(x1, y1);  // Construct the instances declared
    pt2 = new Point(x2, y2);
  }

    public double getMeasure() {
        return pt1.distance(pt2);
    }

    public String toString(){
        return String.format("(%d, %d) to (%d, %d)",pt1.x,pt1.y,pt2.x,pt2.y);
    }

    public double getLength(){
        return pt1.distance(pt2);
    }
}