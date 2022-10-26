import java.util.*;

enum RelationshipType { FAMILY, RELATIVE, FRIEND, COLLEAGUE; }
class Person {
    protected String name, phoneNumber;
    public Person(String n, String p) {  name = n; phoneNumber = p; }
    public String getName() {return name;}
    public String getPhoneNumber() { return phoneNumber; }
    public String toString() { return String.format("%s (%s)", name, phoneNumber);}
}
class Contact extends Person implements Comparable<Contact>{
    private RelationshipType relationship = RelationshipType.FRIEND;

    public Contact(String n, String p) {
        super(n, p);
    }

    public Contact(String n, String p, RelationshipType r) {
        super(n, p);
        relationship = r;
    }

    public String toString(){
        return String.format("%s (%s), %s (%s)",this.getName(),this.getPhoneNumber(), this.getPhoneNumber(),this.relationship);
    }

    public int compareTo(Contact other){

        if (this.relationship.compareTo(other.relationship)==0){
            return this.getName().compareTo(other.getName());
        }
        else{ return this.relationship.compareTo(other.relationship); }
    }   
}

class PhoneBook implements Iterable<Contact>{
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();
    private String name;
    public PhoneBook(String n) { name = n; }
    public void addContact(Contact c) { myContacts.add(c); }
    public Iterator<Contact> iterator() {
      return new ContactsIterator();
    }
    class ContactsIterator implements Iterator<Contact>{ 
        private int nextIndex;
        public boolean hasNext(){
            return nextIndex < myContacts.size();
        }
        public Contact next() {
            return myContacts.get(nextIndex++);
        }
        public void removes(){
            throw new UnsupportedOperationException();
        }
    }
  }