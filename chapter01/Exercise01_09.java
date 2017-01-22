package chapter01;

/**
 * (Area and perimeter of a rectangle) 
 * Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula: area = width * height
 */
public class Exercise01_09 {
	public static void main(String[] args) {
		double height = 7.9;
		double width = 4.5;
		double perimeter;
		double area;
		
		perimeter = 2 * height + 2 * width;
		area = height * width;
		
		System.out.println("The perimeter of a rectangle with height of " + height + " and a width of " + width + " is " + perimeter);
		System.out.println("The area of a rectangle with height of " + height +  " and a width of " + width + " is " + area);
	}
}
