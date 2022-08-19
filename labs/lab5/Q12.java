enum Status{
    ANYTIME("at anytime"),AFTERLUNCH("after lunch"),NIGHT("at night");
    private String value;

    private Status(final String text) {
        this.value = text;
    }
    public String getStatus(){
        return value;
    }
    
}