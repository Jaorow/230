class Rugby{
    private String countryName;
    private int points;

    public Rugby(String name,int points){
        this.countryName = name;
        this.points = points;
    }
    public Rugby(String name){
        this.countryName = name;
        this.points = 0;
    }
    public Rugby(){
        this.countryName = "N/A";
        this.points = 0;
    }

    public String toString(){
        return String.format("Country: %s(%d)",this.countryName,this.points);
    }

    public String getCountryName(){return this.countryName;}
    public int getPoints(){return this.points;}


    public void setPoints(int pointsMinus){
        if (pointsMinus > 0) {
            this.points -= pointsMinus;
        }
    }

    public void setCountryName(String name){
        if (name != "") {
            this.countryName = name;
        }
    }

}
