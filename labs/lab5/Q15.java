class Fighter extends Enemy{

    public Fighter(String name) {
        super(name);
        this.color = "any colour";
        this.comesOut = Status.AFTERLUNCH;
    }
    public Fighter(String name,String color) {
        super(name);
        this.color = color;
        this.comesOut = Status.AFTERLUNCH;
    }
    public void eats() {
        System.out.printf("%s eats food.\n",this.name);
    }
}