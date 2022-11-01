class Item{
    private int itemId;
    private String description;
    private double price;
    private int quantity;

    public Item(int itemId ,String des, double price, int quant){
        this.itemId = itemId;
        this.description = des;
        this.price = price;
        this.quantity = quant;
    }

    public int getItemId(){ return this.itemId; }
    public double getPrice(){ return this.price; }
    public int getQuantity(){ return this.quantity; }
    public String toString(){
        if (isAvailable()) {
            return String.format("ID=%d,%s($%.02f),quantity=%d",this.itemId,this.description,this.price,this.quantity);
        } else {
            return String.format("%s(out of stock)",this.description);

        }
    }
    public boolean isAvailable(){
        if (this.quantity > 0) {
            return true;
        } else {return false;}
    }

    public boolean purchase(){
        if (isAvailable()) {
            quantity --;
            return true;
        } else {
            return false;
        }
    }
}