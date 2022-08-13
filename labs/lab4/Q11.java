class Student{ 
    private String name;
    private int studentid;
    private Supervisor mySupervisor;
    
    public Student(){
        name = "";
        studentid = 0;
        mySupervisor = null;
    }
    public Student(String Name,int id){
        name = Name;
        studentid = id;
    }
    public String getName(){return name;}
    public int getStudentid(){return studentid;}

    public void setStudentid(int new_id){
        if (new_id ==(int)new_id && new_id>0) {
            studentid = new_id;}}
    public String toString(){
        String s = String.format("%s(%d)",name,studentid);
        return s;
    }
    // take in type suporvisor
    public boolean assignTo(Supervisor supervisor){
        if (mySupervisor == null) {
            mySupervisor = supervisor;
            return true;
        }else{return false;}
    }
    public String getSupervisorName(){
        if (mySupervisor != null) {
            return mySupervisor.getName();
        }else{return "UNKNOWN";}
    }
    public boolean unassign(){
        if (mySupervisor != null) {
            mySupervisor = null;
            return true;
        }else{return false;}
    }

}