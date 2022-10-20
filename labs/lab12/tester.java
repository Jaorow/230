class tester{
    public static void main(String[] args) {
        PrimeGenerator s1 = PrimeGenerator.getInstance(3);
        PrimeGenerator s2 = PrimeGenerator.getInstance(4);
        System.out.println( s1 == s2 );
        System.out.println(s1.getCurrentPrime());        
    }
}