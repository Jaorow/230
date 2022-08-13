enum Size { STANDARD(7.5), MEDIUM(10.5), LARGE(13), EXTRALARGE(16.5);
    private double price;
    private Size(double p) {price = p;}
    public double getPrice() { return price; }


public static double getCost(Size pizzaSize, int numberOfPeople, int numberOfPizzas) {
    double j = pizzaSize.getPrice()/numberOfPeople;
    j *=numberOfPizzas;
    return j;}

}