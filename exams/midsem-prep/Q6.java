enum Month{

    JAN(31), FEB(29), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(30), DEC(31);

    private final int day;
    private Month(int day){
        this.day=day;
    }


    public int getNumberOfDays(){
        return day;
    }


}
