import java.util.*;

class IntSequence implements Iterable<Integer> {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();
    public IntSequence(int[] values) { //assume values is not empty
      for (int v: values)
        numbers.add(v);
    }
    public String toString() { return numbers.toString(); }
    public Iterator<Integer> iterator() { return new AscendingIterator(); }

}