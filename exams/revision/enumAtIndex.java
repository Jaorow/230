
enum Temperature { HUCKLE, BOILING, HOT, WARM, COOL, COLD, FREEZING;
    private static final int SIZE = values().length;
    public static final Temperature getTemperature(int index) { 
        if (index >= 6) {
            return Temperature.FREEZING;
        } else {
            
        }
        return Temperature.values()[index];
    }
}

