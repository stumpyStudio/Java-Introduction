package chapter01;
/**
 * This program is used to write an approximation of pi.
 */
public class Exercise01_07 {

	public static void main(String[] args) {
		System.out.println("This will show the difference in the approximation of pi by one additional element");
		System.out.println(4 * (1.0 -  (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
		System.out.println(4 * (1.0 -  (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
	}
}