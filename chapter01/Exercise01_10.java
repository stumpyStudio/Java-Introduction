package chapter01;

/**
 * (Average speed in miles) 
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. 
 * Note: that 1 mile is 1.6 kilometers.
 */
public class Exercise01_10 {
	public static void main(String[] args) {
		double distanceKilometers = 14.0;
		double timeMinutes = 45.5;
		double distanceMiles;
		double timeHours;
		
		distanceMiles = distanceKilometers / 1.6;
		timeHours = timeMinutes / 60;
		
		System.out.println("The average speed in miles per hour is " + distanceMiles / timeHours);		
	}
}
