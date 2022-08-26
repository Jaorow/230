abstract class Employee {
  protected String name;
  protected int baseSalary = 800; //base salary per week
  public Employee(String name) { this.name = name; }
  public Employee(String name, int base) { this.name = name; baseSalary = base; }
  public String toString() { return String.format("%s gets $%.2f per week.", name, calculateSalary()); }
  public abstract double calculateSalary();
 }

class Secretary extends Employee {
    private double hourlyRate;
    private int numberOfHours;
    
    public Secretary(String name){
        super(name);
        this.hourlyRate = 21.20;
        this.numberOfHours = 40;
    }
    public Secretary(String name,double rate,int hours){
        super(name);
        this.hourlyRate = rate;
        this.numberOfHours = hours;
    }

    public double calculateSalary() {
        return hourlyRate*numberOfHours;
    }
    
 }

class Manager extends Employee{
    private int bonus;

    public Manager(String name){
        super(name);
        this.bonus = 100;
    }
    public Manager(String name, int bonus){
        super(name);
        this.bonus = bonus;
    }
    
    public double calculateSalary() {
        return this.baseSalary+this.bonus;
    }
}