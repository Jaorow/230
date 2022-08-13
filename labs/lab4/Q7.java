enum TrafficLight{
    GREEN, YELLOW, RED;
    private static TrafficLight[] values = values();
    public TrafficLight next(){
        return values[(this.ordinal() + 1) % 3];
    }
}