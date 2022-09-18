
abstract class Animal {
    public abstract void canDo();
  }
  class Snake extends Animal {
    public void canDo() { System.out.println("I can crawl"); }
  }
  class Dog extends Animal {
    public void canDo() { System.out.println("I can bark"); }
  }
  class Lion extends Animal {
    public void canDo() { System.out.println("I can roar");}
  }

class AnimalHouse<E> {
    E animal;

    public AnimalHouse(){}
    public AnimalHouse(E ani) { this.animal = ani;}
    public E getAnimal(){ return this.animal;}
    public void setAnimal(E obj){ this.animal = obj; }
    public String toString(){
      return String.format("%s",animal.getClass().getName());
    }
    
}
