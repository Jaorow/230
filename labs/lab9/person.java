import java.util.ArrayList;

abstract class Person {
    protected String name;
    protected Person parent;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public Person getParent(){
        return this.parent;
    }
    public void setParent(Person parent){
        this.parent = parent;
    }
    public abstract String toString();
    
    public String getPath() {
        if (this.parent == null) {
            return this.name;
        }else{
            System.out.printf("%s->",this.getName());
            return this.getParent().getPath();
        }
    }
}

class Member extends Person{
    public Member(String name) {
        super(name);
    }
    public String toString() {
        return this.name;
    }
}

class TeamLeader extends Person{
    private ArrayList<Person> list = new ArrayList<>();
    public TeamLeader(String name) {
        super(name);
    }
    public void add(Person e){
        list.add(e);
    
    }
    public void remove(Person e){
        list.remove(e);
    }

    public String toString(){
        return String.format("%s: %s",this.name,list.toString());
    }
    
    
}