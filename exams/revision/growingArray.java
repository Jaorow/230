import java.util.Arrays;

class GrowingArray {
    private int numberOfIntegers;
    private int[] data = new int[5];

    public GrowingArray(){}

    public int getNumberOfIntegers(){ return numberOfIntegers;}

    public void addElement(int number){
        if ( data.length == numberOfIntegers ){
            int [] newData = new int[numberOfIntegers*2];

            for (int i = 0; i < data.length; i++) { newData[i] = data[i]; }

            data = newData;

            data[numberOfIntegers] = number;
            numberOfIntegers++;
        } else {
            data[numberOfIntegers] = number;
            numberOfIntegers ++;
        }
    }

    public String toString() {
        return Arrays.toString(data);
    }
}
