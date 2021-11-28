
//Author Mike Knoles PA 3.8
//Exercise 7.10 Solution: Sales.java
//number of salespeople that earned salaries in given ranges
import java.util.Scanner;

public class Sales {

	// counts the number of people in given salary ranges
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] total = new int[9]; // totals for the various salaries

		// initialize the values in the array to 0
		for (int counter = 0; counter < total.length; counter++)
			total[counter] = 0;

		// read in values and assign them to the appropriate range
		System.out.print("Enter sales amount (negative to end): ");
		double dollars = input.nextDouble();

		while (dollars >= 0) {
			double salary = dollars * 0.09 + 200;
			int range = (int) (salary / 100);

			if (range > 10)
				range = 10;
			++total[range - 2];

			System.out.print("Enter sales amount (negative to end): ");
			dollars = input.nextDouble();
		}

		// print chart - This can be one line of code
		System.out.println("\nRange\t\tNumber");

		// for loop to display range values one less than total because of special case
		// value
		for (int range = 0; range < total.length - 1; range++)
			System.out.printf("$%d - $%d\t%d\n", (200 + 100 * range), (299 + 100 * range), total[range]);

		// special case for the last range
		System.out.printf("$1000 and over\t%d\n", total[total.length - 1]);
	}
} // end class Sales
