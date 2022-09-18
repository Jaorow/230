public class tester {
    public static void main(String[] args) {
        AnimalHouse<Animal> a1 = new AnimalHouse<Animal>(new Lion());
        a1.getAnimal().canDo();
        System.out.println(a1);
    }

    
}
