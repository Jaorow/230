import java.util.*;

class SquareSequence implements Iterable<Integer> { 
    private ArrayList<Integer> listOfSquares;

    public SquareSequence(){ this.listOfSquares = new ArrayList<Integer>(); }

    public SquareSequence(int[] nums){
        this.listOfSquares = new ArrayList<Integer>();

        for (int i : nums) {
            if ((Math.sqrt(i) - Math.floor((Math.sqrt(i))) == 0)){
                listOfSquares.add(i);
            }
        }
        
    }

    public String toString(){
        return String.format("%s",listOfSquares.toString());
    }

    public Iterator<Integer> iterator() {
        return new NumberIterator();
    }

    class NumberIterator implements Iterator<Integer> {
	    private int nextIndex = 0;
	    public boolean hasNext() {return (nextIndex < listOfSquares.size());}
	    public Integer next() {
            return listOfSquares.get(nextIndex++);
        }
    }
}
