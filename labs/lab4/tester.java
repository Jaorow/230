public class tester {
    public static void main(String[] args) {
        Sentence s1 = new Sentence("Hello world");
        System.out.println(s1);
        Sentence s2 = new Sentence("Summer is over and the hot days are gone");
        System.out.println(s2);
        Sentence s3 = new Sentence();
        System.out.println(s3);
        System.out.printf("%d, %d, %d %.2f", s1.getNumSpaces(),s1.getNumVowels(), s1.getNumConsonants(), s1.getVowelsToConsonantsRatio() );
    }
}
