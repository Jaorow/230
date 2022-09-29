import java.util.ArrayList;

abstract class Expense {
    protected String title;
    protected double amount = 0;
    public Expense(String title,double amount){
        this.title = title;
        this.amount = amount;
    }
    public Expense(String title){
        this.title = title;
    }
    public String toString(){
        return String.format("%s($%.0f)",this.title,getAmount());
    }
    abstract double getAmount();
}

class SingleExpense extends Expense{

    public SingleExpense(String title) {
        super(title);
    }

    public SingleExpense(String title, double amount) {
        super(title, amount);
    }

    public double getAmount() {
        return this.amount;
    }
}

class CompositeExpense extends Expense{
    private ArrayList<Expense> items = new ArrayList<>();
    public CompositeExpense(String title) {
        super(title);
    }
    public void add(Expense e){
        items.add(e);
    }
    public void remove(Expense e){
        items.remove(e);
    }

    public double getAmount() {
        double total = 0;
        for (Expense expense : items) {
            total += expense.getAmount();
        }
        return total;
    }
    
}