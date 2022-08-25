import java.util.*;
public class tester {
    public static void main(String[] args) {
            // first_two_questions();
            // Q3_4_5();
            // Q6_7_swimming();
            // Q8_nested_classes();
            PrimeSequence();
        }
        private static void PrimeSequence(){
        PrimeSequence ps = new PrimeSequence();
        System.out.println(ps);
        PrimeSequence ps2 = new PrimeSequence(7);
        System.out.println(ps2);
        PrimeSequence ps1 = new PrimeSequence();
        for (int i: ps1) System.out.print(i + " "); System.out.println();
        PrimeSequence ps3 = new PrimeSequence(7);
        for (int i: ps3) System.out.print(i + " ");
        PrimeSequence ps4 = new PrimeSequence();
        for (int i: ps4) System.out.print(i + " "); System.out.println();
        PrimeSequence ps5 = new PrimeSequence(7);
        for (int i: ps5) System.out.print(i + " ");
        
        }
        public static void Q8_nested_classes() {
            Rectangle r1 = new Rectangle(100, 120, 30, 40);
            Rectangle.MyIncrementer obj = r1.new MyIncrementer(1,2);
            obj.increment();
            System.out.println(r1);
            obj.increment();
            System.out.println(r1);
            Rectangle r2 = new Rectangle(40, 60, 30, 40);
            r2.moving();
            System.out.println(r2);
            r2.moving();
            System.out.println(r2);

            Rectangle r3 = new Rectangle(40, 60, 30, 40);
            r3.jumping();
            System.out.println(r3);
            r3.jumping();
            System.out.println(r3);
    }
        public static void Q6_7_swimming(){
            new Demo(true);
            new Demo(false);
            new Demo2(true);
            new Demo2(false);
        }

        public static void Q3_4_5(){
            Country nz = new Country("New Zealand",4822233, 268021);
            System.out.println(nz.getCountryName());
            System.out.println(nz.getPopulation());
            System.out.println(nz.getLandArea());
            System.out.println(nz);
            Country sg = new Country();
            System.out.println(sg.getCountryName());
            System.out.println(sg.getPopulation());
            System.out.println(sg.getLandArea());
            System.out.println(sg);
            //Q4
            Country nz2 = new Country("New Zealand",4822233, 268021);
            Country sg2 = new Country();
            System.out.println(nz2.compareTo(sg2));
            Country[] array = new Country[]{ new Country(), new Country("New Zealand", 4822233, 268021), new Country("Fiji", 889953, 18333), new Country("Australia", 25499884, 7692300), new Country("Singapore",  5850342, 700)};
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            //Q5
            System.out.println("===========");
            
            Country[] array2 = new Country[]{new Country("Singapore", 5850342, 700), new Country("New Zealand",4822233, 268021), new Country("Fiji", 889953, 18333), new Country("Australia", 25499884, 7692300), new Country()};
            System.out.println(Arrays.toString(array2));
            Arrays.sort(array2);
            System.out.println(Arrays.toString(array));
            Comparator<Country> c = new CompareByDensity();
            Arrays.sort(array2 , c);
            System.out.println(Arrays.toString(array2));
        }

        public static void first_two_questions(){
            Decrementable[] array = new Decrementable[]{ new NumberDecrementer(), new NumberDecrementer(10), new NumberDecrementer(20)};
            for (Decrementable i: array) i.decrement();
            for (Decrementable i: array) System.out.println(i);
            RainbowColor rc1 = new RainbowColor();
            for (int i = 0; i<5; i++) {
            System.out.println(rc1);
            rc1.decrement();

        }
    }
}
