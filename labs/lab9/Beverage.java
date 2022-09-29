class Tea extends Beverage{
    public void prepare() {
        System.out.println("add a teabag");
    }
  }
  class Coffee extends Beverage{
    public void prepare() {
        System.out.println("add 1 teaspoon instant coffee powder");
        
    }
  } 

abstract class Beverage{
    abstract void prepare();
    public void make(){
        prepare();
        addHotWater();
        addSugar();
        addMilk();        
    }
    private void addHotWater(){System.out.println("add a cup of hot water");}
    private void addSugar() { System.out.println("add 1 teaspoon sugar");}
    private void addMilk(){ System.out.println("add 1 tablespoon milk");  }
}