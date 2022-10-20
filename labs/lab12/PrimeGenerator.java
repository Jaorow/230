class PrimeGenerator{
    private int current;
    private static PrimeGenerator generator = null;
    private PrimeGenerator(int num) {
        this.current = num;
        if (!isPrime(num)) {
            this.current = getNextPrime();
        }
    }
    private static boolean isPrime(int number){
    if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
 }
    public static PrimeGenerator getInstance(int value) {
        if (generator == null) {
            generator = new PrimeGenerator(value);
        }
        return generator;
    }
    public int getCurrentPrime(){
        return this.current;
    }
    public int getNextPrime(){
        this.current++;
        for(int i = 2; i<current; i++){
        if(current % i == 0){
            current++;
            i=2;
        }
        
        else{
            continue;
        }
    }
        return this.current;
    }
}
    