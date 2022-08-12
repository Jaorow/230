class Sentence{
    private String text = "";
    private String con = "BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtWwVvXxYyZz";
    private String vow = "aAeEiIoOuU";
    private int numSpaces,numVowels,numConsonants;
    
    public Sentence(){
        text = "";
    }
    public Sentence(String sent){
        text = sent;
        String[] split_string = sent.split("");
        
        for (String letter : split_string) {

            

            if(con.contains(letter)){
                numConsonants++;
            }

            else if(vow.contains(letter)){
                numVowels++;
            }else{numSpaces++;}
   
        }
    }
    
    public int getNumVowels(){return numVowels;}
    public int getNumConsonants(){return numConsonants;}
    public int getNumSpaces(){return numSpaces;}

    public double getVowelsToConsonantsRatio(){
        double i = numVowels;
        double j =numConsonants;
        return i/j;
    }
    
    public String toString(){
        String ret = String.format("%s(spaces=%d,vowels=%d,consonants=%d)",text,numSpaces,numVowels,numConsonants);
        return ret;
    }

}