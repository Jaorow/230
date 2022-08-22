class RainbowColor implements Decrementable {
    private String[] rainbow = {"red", "orange", "yellow", "green", "cyan", "blue", "purple"};
    private int colorIndex;

    public RainbowColor(){
        colorIndex = 6;
    }
    public RainbowColor(int i){
        if (i <= 6 && i >0) {
            colorIndex = i;
        }else{colorIndex = 6;}
    }
    public String toString(){
        String s = String.format("The color is %s",rainbow[colorIndex]);
        return s;
    }

    public void decrement(){
        if (colorIndex <= 0) {
            colorIndex = 6;
        } else {
            colorIndex --;
        }
    }
}