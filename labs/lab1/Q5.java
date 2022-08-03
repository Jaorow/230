package labs.lab1;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		System.out.println("Enter the latitude of city1:");
		double lat1 = input.nextDouble();
		

		System.out.println("Enter the longitude of city1:");
		double lon1 = input.nextDouble();

		System.out.println("Enter the latitude of city2:");
		double lat2 = input.nextDouble();

		System.out.println("Enter the longitude of city2:");
		double lon2 = input.nextDouble();
		
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);

		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);


		// double lon1 = Math.toRadians(-174.7399);
		// double lat1 = Math.toRadians(-36.8404);
		
		// double lon2 = Math.toRadians(-151.2094);
		// double lat2 = Math.toRadians(-33.8600);
		


		double sinLat = Math.sin((lat2-lat1)/2);
		sinLat = Math.pow(sinLat, 2.0);
		
		double sinLon = Math.sin((lon2-lon1)/2);
		sinLon = Math.pow(sinLon, 2.0);

		double asin = Math.asin(Math.sqrt((sinLat +( Math.cos(lat1) * Math.cos(lat2) * sinLon))));

		double result = (2*6371)*asin;

		System.out.printf("The distance between the two cities is %.02fkilometres.\n",result);
		input.close();
	} 
} 