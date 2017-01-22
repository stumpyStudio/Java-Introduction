package chapter01;

/**
 * (Algebra: solve 2 * 2 linear equations) 
 * Use Cramer’s rule to solve the following 2 * 2 system of linear equation:
 * 3.4x + 50.2y = 44.5 
 * 2.1x + .55y = 5.9
 */
public class Exercise01_13 {
	public static void main(String[] args) {
		//declare variables for values a through f;
		final double a = 3.4;
		final double b = 50.2;
		final double c = 2.1;
		final double d = 0.55;
		final double e = 44.5;
		final double f = 5.9;
		
		//calculate values for x and y using the above constants
		double x = (e *d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
				
		//display values for x and y
		System.out.println("The value for x is " + x);
		System.out.println("The value for y is " + y);
	}
}
