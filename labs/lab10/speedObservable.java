import java.util.Observable;
import java.util.Observer;

class SpeedObservable extends Observable{
    private int currentSpeed;
    public static int SPEED_LIMIT = 70;
 
    public SpeedObservable(){
        currentSpeed = 0;
    }

    public void setCurrentSpeed( int speed ){
        this.currentSpeed = speed;
        setChanged();
        String mes;
        if (speed > SPEED_LIMIT) {
            mes = String.format("ALERT! Driving too fast! (%d)",speed);
        }else{
            mes = ("Nice and steady!");
        }
        notifyObservers(mes);
    }
}

class SpeedMonitor implements Observer{
    public void update(Observable o, Object message){
        System.out.println(message);
    }
}