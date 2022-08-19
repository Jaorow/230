abstract class Enemy{
    protected String name = "UNKNOWN";
    protected String color = "UNKNOWN";
    protected Status comesOut;

    public Enemy(String name){
        this.name = name;
    }
    public Enemy(String name,String color){
        this.name = name;
        this.color = color;
    }
    public String toString(){
    String s = String.format("%s is a %s in %s.",name,getClass().getName(),color);
    return s;
    }

    public void printComesOutInfo(){
        System.out.printf("The %s can come out %s.\n",getClass().getName(),comesOut.getStatus());
    }
    abstract void eats();
}
