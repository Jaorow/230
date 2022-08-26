class A {
    protected int x;
    public A() { x = 10;}
}
class D extends A {
    protected int x;
    public D(int x){this.x = super.x + x;}
}


