interface Swim {
  public void fastSwim();
  public void slowSwim();
}

class Demo{
  public Demo(boolean isFast){
    Swim obj = new Swim(){
        public void fastSwim() {
            System.out.println("I can swim fast.");
        }
        public void slowSwim() {
            System.out.println("Sorry, I run out of energy.");          
        }
    };

    if (isFast)
      obj.fastSwim();
    else
      obj.slowSwim(); 
  }

}

