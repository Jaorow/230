import java.util.Comparator;

abstract class Property implements Comparable<Property>{
  protected int propertyId = 1, numberOfBedrooms = 1;
  protected int basicRent = 0, factor = 1;
  public Property(int id, int rent) {
    propertyId  = id;
    basicRent = rent;
  }
  public Property(int id, int rent, int factor, int number) {
    propertyId = id;
    basicRent = rent;
    this.factor = factor;
    numberOfBedrooms = number;
  }
  public int getPropertyId() { return propertyId; }
  public abstract int calculateRent();
  public String toString() { return String.format("%s(%d),rent=%d", getClass().getName(), propertyId, calculateRent()); }
  public int compareTo(Property other){
        return this.calculateRent() - other.calculateRent();
    }
}

class Apartment extends Property {
    private boolean gymAvailable;

    public Apartment(int id, int rent,boolean gym) {
        super(id, rent);
        this.gymAvailable = gym;
    }

    public int calculateRent() {
        if (gymAvailable) {
            return this.basicRent + 100;
        } else {
            return this.basicRent;
        }
    }
}

class House extends Property {
    private boolean hasGarden;


    public House(int id, int rent,int noBed,boolean hasGarden) {
        super(id, rent,120,noBed);
        this.hasGarden = hasGarden;
    }

    public int calculateRent() {
         if (hasGarden) {
            return (this.numberOfBedrooms*this.factor)+this.basicRent + 100;
        } else {
            return (this.numberOfBedrooms*this.factor)+this.basicRent ;
        }
    }
}
class CompareByID implements Comparator<Property> {

  public int compare(Property o1, Property o2) {
    return o1.propertyId - o2.propertyId;

  }
}