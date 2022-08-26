import java.util.ArrayList;
import java.util.Iterator;

class PrimeSequence implements Iterable<Integer> {
    private ArrayList<Integer> listOfPrimes = new ArrayList<Integer>();

    public boolean isPrime(int n) {
        if (n == 2) return true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) 
            return false;
        }
        return true;
    }

    public PrimeSequence(){
        this(5);
    }

    public PrimeSequence(int number){
        int count = 2;
        while (listOfPrimes.size() < number) {
            
            // System.out.printf("%d --> %s\n",count,isPrime(count));
            if (isPrime(count)) {
                listOfPrimes.add(count);
                count ++;
            }else{count ++;}
        }
    }

    public String toString(){        
        return String.format("Primes: %s",listOfPrimes.toString());
    }

        
    public Iterator<Integer> iterator() { return new PrimeIterator(); }


    
    class PrimeIterator implements Iterator<Integer>{
        private int nextIndex = 0;


        public boolean hasNext() { return nextIndex<listOfPrimes.size(); }
        

        public Integer next() { return listOfPrimes.get(nextIndex++);}
        }

    }
