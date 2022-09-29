public class tester {
    public static void main(String[] args) {
        Person p1 = new Member("Mike");
        TeamLeader c1 = new TeamLeader("David");
        TeamLeader c2 = new TeamLeader("Dick");
        c1.add(c2);
        c2.add(p1);
        System.out.println(p1.getPath());
        System.out.println(c1);
    }
}
