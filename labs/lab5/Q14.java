class Vampire extends Enemy{

    public Vampire(String name) {
        super(name);
        this.color = "red";
        this.comesOut = Status.NIGHT;
    }
    public Vampire(String name,String color) {
        super(name);
        this.color = color;
        this.comesOut = Status.NIGHT;
    }

    
    public void eats() {
        System.out.printf("%s drinks human blood.\n",this.name);
    }


}