package chapter01;

/**
 * 
 * (Population projection)
 * Write a program to display the population for each of the next five years given the full problem detail.
 */
public class Exercise01_11 {
	public static void main(String[] args) {
		// constant for population in the current year (year 0)
		final int populationCurrent = 312032486;
		
		// constant for number of seconds in a year with 365 days
		final int secondsInAYear = 365 * 24 * 60 * 60;
		
		// calculations for the netPopulationChange in a given year
		final double birthsPerYear = secondsInAYear / 7.0;
		final double deathsPerYear = secondsInAYear / 13.0;
		final double immigrantsPerYear = secondsInAYear / 45;
		final double netPopulationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
		
		//declare variables for population at years 1-5
		double populationYearOne, populationYearTwo, populationYearThree, populationYearFour, populationYearFive;
		
		// calculate the populations for years 1-5 given the netPopulationChange
		populationYearOne = populationCurrent + netPopulationChangePerYear;
		populationYearTwo = populationCurrent + 2 *netPopulationChangePerYear;
		populationYearThree = populationCurrent + 3* netPopulationChangePerYear;
		populationYearFour = populationCurrent + 4 * netPopulationChangePerYear;
		populationYearFive = populationCurrent + 5 * netPopulationChangePerYear;

		// display populations for years 1-5
		System.out.println("The population for year one is " + populationYearOne);
		System.out.println("The population for year two is " + populationYearTwo);
		System.out.println("The population for year three is " + populationYearThree);
		System.out.println("The population for year four is " + populationYearFour);
		System.out.println("The population for year five is " + populationYearFive);		
	}
}
