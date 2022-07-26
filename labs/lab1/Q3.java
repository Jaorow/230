import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter kilowatt per hour used:");
    float kwh = input.nextFloat();
    // double kwh = 502;
   
 
    System.out.println("Enter the number of days:");
    float days = input.nextFloat();
    // double days = 27;

    System.out.println("Enter the charge per kwh (cents):");
    float charge_kwh = input.nextFloat();
    // double charge_kwh = 19.85;
    
    System.out.println("Enter the charge per day (cents):");
    float charge_day = input.nextFloat();
    // double charge_day =217;

    System.out.println("Enter the levy per kwh (cents):");
    float lev_day = input.nextFloat();
    // double lev_day = 0.3;

        
    double gst_rate = 15;

    double total = (kwh*charge_kwh/100)+(days*charge_day/100)+(kwh*(lev_day/100));

    System.out.printf("%.0f kilowatt hours: $%.0f\n",kwh,(kwh*charge_kwh/100));
    System.out.printf("%.0f days: $%.0f\n",days,(days*charge_day/100));
    System.out.printf("Levy: $%.0f\n",(kwh*(lev_day/100)));
    System.out.printf("GST: $%.0f\n",total*(gst_rate/100));
    System.out.printf("Total Electricity Charges: $%.0f\n",total+(total*(gst_rate/100)));
    
    input.close();
  }
}