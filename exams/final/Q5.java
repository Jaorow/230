import java.util.ArrayList;

class VendingMachine{
    private ArrayList<Item> items;
    private String location;
    private int vendingId;
    public static int count;
    public VendingMachine(String s){
        this.items = new ArrayList<Item>();
        this.location = s;
        this.vendingId = count++;
    }
    public int getVendingId(){
        return this.vendingId;
    }

    public void addItem(Item i){
        if (i.isAvailable()) {
            items.add(i);
        }
    }
    public int getNumberOfItems(){
        return items.size();
    }

    public void printAllItems(){
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public double purchase(int id){
        for (Item item : items) {
            if (item.getItemId() == id) {
                if (item.isAvailable()){
                item.purchase();
                return item.getPrice();
                } else { return 0.0; }
            }
        }
        return 0.0;
    }

}