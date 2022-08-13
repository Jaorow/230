
public class tester {
    public static void main(String[] args){

        Student s1 = new Student("Ashley Kumar", 1);
        Student s2 = new Student("Ben Chan", 2);
        Student s3 = new Student("Clara Zhang", 3);
        Supervisor staff1 = new Supervisor("Peter Pan", 101);
        Supervisor staff2 = new Supervisor("Michael Hill", 102);
        System.out.println(staff1.addStudent(s1));
        System.out.println(staff1.addStudent(s2));
        System.out.println(staff1);
        System.out.println(staff1.removeStudent(s1));
        System.out.println(staff1.removeStudent(s3));
        System.out.println(staff1);
        System.out.println(staff2.addStudent(s2));
        System.out.println(staff2.addStudent(s3));
        System.out.println(staff2);

    }
}