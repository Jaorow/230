// import java.lang.*;
import java.util.Comparator;

class Country implements Comparable<Country>{
    private String countryName = "Unknown";
    private int population = 100;
    private double landArea  = 1;

    public Country(){}

    public Country(String name,int population, double landArea){
        this.countryName = name;
        this.population = population;
        this.landArea = landArea;
    }
    public String getCountryName(){return countryName;}
    public int getPopulation(){return population;}
    public double getLandArea(){return landArea;}
    public int getPopulationDensity(){ return (int) Math.round(population/landArea);}
    public String toString(){
        String s = String.format("%s(%d)",countryName,getPopulationDensity());
        return s;
    }

    public int compareTo(Country other) {
        return this.countryName.compareTo(other.countryName);
    }
}


class CompareByDensity extends Country implements Comparator<Country>{


    public int compare(Country c1, Country c2){
        
        return Integer.compare(c1.getPopulationDensity(), c2.getPopulationDensity());
    }
  
    
}
