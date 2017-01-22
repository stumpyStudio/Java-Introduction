package chapter01;
 /**
  * (Average speed in kilometers) 
  * Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
  * Write a program that displays the average speed in kilometers per hour. 
  * Note that 1 mile is 1.6 kilometers.
  */
public class Exercise01_12 {
	public static void main(String[] args){
		double timeHours = 1.0 + (40.0 / 60) + (35.0 / 3600);
		double distanceKilometers = 24 * 1.6;
		
		System.out.println("The average speed in kilometers per hour is " + distanceKilometers / timeHours);
	}
}
