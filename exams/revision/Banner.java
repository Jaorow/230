import java.util.ArrayList;

public class Banner {
    private String word;
    private int width;
    public Banner(){
        this.word = "";
        this.width = 4;
    }
    public Banner(String word){
        this.word = word;
        this.width = this.word.length()+4;
    }
    public Banner(String word, int width){
        this.word = word;
        if (width >= this.word.length()+4) {
            this.width = width;
        } else { 
            this.width = this.word.length()+4;
        }
    }

    public String toString(){
        String firstAndLast = "";
        for (int i = 0; i < width; i++) { firstAndLast += "*"; }

        String middle = "*";
        String spaces = "";
        for (int i = 0; i < ((width-word.length())/2)-1; i++) {
            spaces += " ";
        }
        middle += spaces; middle += word; middle += spaces;
        if (middle.length() != firstAndLast.length()-1){
            middle += " *";
        } else { middle += "*"; }
        return String.format("%s\n%s\n%s",firstAndLast,middle,firstAndLast);
    }

    public int getWidth(){ return this.width; }
    public void setWidth(int width){         
        if (width >= this.word.length()+4) {
            this.width = width;
        } else { 
            this.width = this.word.length()+4;
        } 
    }
}

class Container{
    private ArrayList<Banner> words = new ArrayList<Banner>();
    private int width;
    public Container(){};
    public void add(Banner word){
        if(word.getWidth() <= width){
            word.setWidth(width);
            words.add(word);
        } else {
            words.add(word);
            this.width = word.getWidth();
            for (Banner banner : words) {
                banner.setWidth(width);
            }

        }
    }
    public String toString(){
        String cont = "";
        for (Banner banner : words) {
            cont += banner.toString();            
        }
        return cont;
    }
    
}