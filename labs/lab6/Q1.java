interface Decrementable{
    public void decrement();
}

class NumberDecrementer implements Decrementable {
    private int value;

    public NumberDecrementer(){value = 100;}
    public NumberDecrementer(int i){value = i;}

    public void decrement() {
        value --;
    }

    public String toString(){
        String s = String.format("The value is %d", value);
        return s;
    }
    
}
