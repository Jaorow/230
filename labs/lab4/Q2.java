class Sentence{
    private String text = "ab ";
    private String[] vow = {"a","A","e","E","i","I","o","O","u","U"};
    private int numSpaces = NumSpaces(),numVowels = NumVowels(),numConsonants = NumConsonants();
    
    public Sentence(){
        text = "";
    }
    public Sentence(String sent){
        text = sent;
    }

    private int NumSpaces(){
        String[] arr = text.split("");

        for (String letter : arr) {
            if(letter == " "){
            numSpaces ++;
            }
        }
        return numSpaces;
    }


    private int NumVowels(){
        String[] arr = text.split("");

        for (String i : arr) {
            for (String v : vow) {
                if (i == v) {
                    numVowels ++;
                }
            }
        }
        return numVowels;
    }    
    private int NumConsonants(){
        // int Vowels = getNumVowels();
        // int spaces = getNumSpaces();
        int length = text.length();
        numConsonants = length - numSpaces - numVowels;
        return numConsonants;
    }
    public int getNumVowels(){return numVowels;}
    public int getNumConsonants(){return numConsonants;}
    public int getNumSpaces(){return numSpaces;}

    public double getVowelsToConsonantsRatio(){
        int Vowels = numVowels;
        int cons = numConsonants;
        return Vowels/cons;
    }
    public String toString(){
        // int sVowels = getNumVowels();
        // int sspaces = getNumSpaces();
        // int scons = getNumConsonants();
        String ret = String.format("%s(spaces=%d,vowels=%d,consonants=%d)",text,numSpaces,numVowels,numConsonants);
        return ret;
    }

}