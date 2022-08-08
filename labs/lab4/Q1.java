class Monkey {
    public static int numberOfMonkeys = 0;
    private String name = "N/A";

    public Monkey(){
        numberOfMonkeys ++;
    }

    public Monkey(String st){
        name = st;
        numberOfMonkeys ++;
    }

    public void setName(String n){
        name = n;
    }

    public static void setNumberOfMonkeys(int n){
        numberOfMonkeys = n;
    }

    public String getName(){
        return name;
    }

    public static int getNumberOfMonkeys(){
        return numberOfMonkeys;
    }

    public String toString(){
        if (numberOfMonkeys == 1) {
            String s = name+" is the only monkey";
            return s;
        }else{
        String s = name +" is one of "+numberOfMonkeys+" monkeys";
        return s;
        }
    }

}