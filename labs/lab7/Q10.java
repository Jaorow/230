class Person implements Comparable<Person> {
    protected String name="", irdNumber="";
    public Person(String name, String irdNumber) {
      this.name = name;
      this.irdNumber = irdNumber;
    }
    public String toString() { return String.format("%s(%s)", name, irdNumber); }
    public int compareTo(Person p) {
      return name.compareTo(p.name);
    }
  }
  class Employee extends Person {
    protected double weeklySalary;
    public Employee(String n, String ird, double salary) {
      super(n, ird);
      weeklySalary = salary;
    }
  }

class Q10{
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Stanley Smith", "123-456-789");
        people[1] = new Employee("David Clark", "999-222-111", 980);
        people[2] = new Person("Jane Graff", "245-123-345");
        System.out.println(getMaxEntry(people));
        Employee[] array = new Employee[]{new Employee("Jane Graff", "245-123-345", 1200), new Employee("Dick Smith", "999-222-111", 980), new Employee("Mike Hill", "123-456-789", 1500)};
        Employee e = getMaxEntry(array);
        System.out.println(e);
    }

    public static <T extends Person> T getMaxEntry(T[] people){
        T max = people[0];
        for (T person : people) {
            int c = person.compareTo(max);
            if (c > 0) {
                max = person;
            }
        }
        return max;
    }


}
