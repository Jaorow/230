import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Garden {
	private Garden _parent = null;
	protected double _length;
	protected double _width;
    abstract double calculatePerimeter();
    public Garden(double length, double width) {
	    _length = length;
	    _width = width;
	 }
    public Garden getParent() {
		return _parent;
	}
	protected void setParent(Garden parent) {
		_parent = parent;
	}
}

class TerminalGarden extends Garden{
	public TerminalGarden(double length, double width) {
	    super(length, width);
	 }
	public double calculatePerimeter() {
    	double perimeter = 2*(_length+_width);
    	System.out.println("The perimeter of this "+getClass().getSimpleName()+" is "+perimeter);
    	return perimeter;
    }
}

//Complete this class as per question requirements
class AggregateGarden extends Garden{
	 private List<Garden> _childGardens;

	 public AggregateGarden(double length, double width) {
		 super(length, width);
		 _childGardens = new ArrayList<Garden>();
	 }
	 //iterates through the child gardens in a depth-first order
	 //and must also print the perimeter of this aggregate garden
	 //in the string format shown in the test case examples
	 public double calculatePerimeter() {
	    
	 }
	 //adds a child garden to this aggregate garden after fullfilling the
	 //conditions as specified in the description
	 public boolean addGarden(Garden garden) {
	    
	    return false;
	 }
	 public List<Garden> getChildren(){
		 return _childGardens;
	 }
}

//Main class -- only for writing tests
public class GardenApp {
    public static void main(String[] args) {
    	AggregateGarden g1 = new AggregateGarden(35,54);
AggregateGarden g2 = new AggregateGarden(12,53);
Garden g3 = new TerminalGarden(32,34);
Garden g4 = new TerminalGarden(11,42);		
Garden g5 = new TerminalGarden(23,25);	
AggregateGarden g6 = new AggregateGarden(11,52);
    			
g6.addGarden(g5);
g2.addGarden(g6);
g2.addGarden(g4);
g1.addGarden(g2);
g1.addGarden(g3);
    		
System.out.println("Total Perimeter: " + g1.calculatePerimeter()); 
//perimeter calculated from depth-first traversal g1->g2->g6->g5->g4>g3
    }
}