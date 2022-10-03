import java.util.ArrayList;

class SpeedObservable{
    private boolean changed = false; 
    private ArrayList<SpeedMonitor> monitors;
    public void addObserver(SpeedMonitor m){
        monitors.add(m);
    }
    public void deleteObserver(SpeedMonitor m){
        monitors.remove(m);
    }
    public int countObservers(){
        return monitors.size();
    }
    public void setChanged(){
        changed = true;
    }
    public void clearChanged(){
        changed = false;
    }
    public boolean hasChanged(){
        return changed;
    }

    private int currentSpeed;
    public static int SPEED_LIMIT = 70;
    public SpeedObservable(){
        currentSpeed = 0;
    }
    public void setCurrentSpeed(int speed){
        this.currentSpeed = speed;
        setChanged();

        for (SpeedMonitor speedMonitor : monitors) {
            
            String mes;
            if (speed > SPEED_LIMIT) {
                mes = String.format("ALERT! Driving too fast! (%d)",speed);
            }else{
                mes = ("Nice and steady!");
            }
    
                System.out.println(mes);
            
        }

        
    }

}