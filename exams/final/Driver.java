import java.util.ArrayList;
import java.util.List;

public class Driver { 
    private static Driver _driver; //change access modifier as per the requirements
    private String _driverName;
    private Driver(String name){
        _driverName = name;
    }
    public static Driver getDriver(String driverName){
        if (_driver == null) {
             _driver = new Driver(driverName );
        }
        return _driver;
    }
    public String getName() {
        return _driverName;
    }
}







public class Driver { 
    private static Driver _driver;
    private String _driverName;
    
	//make corrections to the method body or access modifiers only
    private Driver(String name){
        _driverName = name;
    }

    //make corrections to the method body or access modifiers only
    public static Driver getDriver(String driverName){
        if (_driver == null) { _driver = new Driver(driverName );
        }
        return _driver;
    }

    //make corrections to the method body or access modifiers only
    public String getName() {
        return _driverName;
    }
}