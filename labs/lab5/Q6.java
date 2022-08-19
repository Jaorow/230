abstract class MyQuadrilateral{
    protected double sideA,sideB,sideC,sideD,height;

    public MyQuadrilateral(){
        sideA = 10;       
        sideB = 10;
        sideC = 10;
        sideD = 10;
        height = 10;  
}

    public double getSideA(){return this.sideA;}
    public double getSideB(){return this.sideB;}
    public double getSideC(){return this.sideC;}
    public double getSideD(){return this.sideD;}
    public double getHeight(){return this.height;}

    public double getPerimeter(){
        return sideA + sideB + sideC + sideD;
    }
    abstract double getArea();

    public String toString(){
        String s = String.format("%s(area=%.02f, perimeter=%.02f)",getClass().getName(),getArea(),getPerimeter());
        return s;
    }

}



