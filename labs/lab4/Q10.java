import java.util.*;

class Supervisor{
    private String name;
    private int supervisorid;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public Supervisor(){
        name = "";
        supervisorid = 0;
    }
    public Supervisor(String Name,int id){
        name = Name;
        supervisorid = id;
    }
    public String getName(){return name;}
    public int getSupervisorid(){return supervisorid;}

    public boolean addStudent(Student s){
        if (s.getSupervisorName() =="UNKNOWN") {
            this.students.add(s);
            return s.assignTo(this);
        }else{return false;}}
    
    public boolean removeStudent(Student s){
        if (s.getSupervisorName() == name) {
            this.students.remove(s);
            return s.unassign();
        }else{return false;}
    }
    public String toString(){
        String s = String.format("%s(%d)\nStudents: ",name,supervisorid);
        s += students;
        return s;
    }
}