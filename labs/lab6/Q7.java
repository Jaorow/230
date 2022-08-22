
interface Swim {
  public void fastSwim();
  public void slowSwim();
}

class Demo2{
  public Demo2(boolean isFast){

    class MySwimInner implements Swim{

        public void fastSwim() {
            System.out.println("I can swim fast.");
        }
        public void slowSwim() {
            System.out.println("Sorry, I run out of energy.");          
        }
    }
    Swim obj = new MySwimInner();
    if (isFast)
      obj.fastSwim();
    else
      obj.slowSwim(); 
  }

}



