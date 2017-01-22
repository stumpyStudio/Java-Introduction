package chapter01;
/**
 * (Area and perimeter of a circle) 
 * Write a program that displays the area and perimeter of a circle that has a radius of 5.5
 */
public class Exercise01_08 {

	public static void main(String args[]){
		double circleArea, circlePerimeter;
		circleArea = 5.5 * 5.5 * Math.PI;
		circlePerimeter = 2 * 5.5 * Math.PI;
		
		System.out.println("The area of a circle with a radius of 5.5 is  " + circleArea);
		System.out.println("The perimeter of a circle with a radius of 5.5 is " + circlePerimeter);
	}
}
