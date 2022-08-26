class C {
    public void m1(){System.out.println("m1-c");}
    public void m2(){System.out.println("m2-c");}

    }
    
class D extends C {
    public void m1(int x){System.out.println("m1(int)-D");}
    public void m2() {System.out.println("m2-d");}
    public void m3() {System.out.println("m3-d");}
}