import java.util.*;
class SubUniqueEven extends ArrayList<Integer>{

    public SubUniqueEven(){}

    public boolean add(int number) {
        if (super.contains(number)) {
            return false;
        }else {
            if (number%2==0) {
                super.add(number);
                return true;
            }else{return false;}
        }
    }


    public void addAll(int[] array){
        for (int i : array) {
            if (i%2==0 && !super.contains(i)) {super.add(i);}
        }
    }

    public void removeByValue(int number){
        if (super.contains(number)) {
            super.remove(super.indexOf(number));
        }
    }
    public boolean contains(int number){
        if (super.contains(number)) {
            return true;
        } else {return false;}
    }

    public String toString(){
        return String.format("%s",super.toString());
    }

}







class BasicUniqueEven implements Iterable<Integer>{
    private ArrayList<Integer> items;
    public BasicUniqueEven(){
        items = new ArrayList<Integer>();
    }
    public boolean add(int number) {
        if (items.contains(number)) {
            return false;
        }else {
            if (number%2==0) {
                items.add(number);
                return true;
            }else{return false;}
        }
    }

    public void addAll(int[] array){
        for (int i : array) {
            if (i%2==0 && !items.contains(i)) {items.add(i);}
        }
    }
    public void removeByValue(int number){
        if (items.contains(number)) {
            items.remove(items.indexOf(number));
        }
    }
    public boolean contains(int number){
        if (items.contains(number)) {
            return true;
        } else {return false;}
    }
    public String toString(){
        return String.format("%s",items.toString());
    }

    public int size(){return items.size();}
    public int get(int i){return items.get(i);}
    public Iterator<Integer> iterator() { return new UniqueEvenIterator(this); }

}

class UniqueEvenIterator implements Iterator<Integer>{
    private int nextIndex = 0;
    private BasicUniqueEven list;

    public UniqueEvenIterator(BasicUniqueEven l){
        this.list = l;
    }

    public boolean hasNext() {return nextIndex<list.size();}
    public Integer next() {return list.get(nextIndex++);}

}

