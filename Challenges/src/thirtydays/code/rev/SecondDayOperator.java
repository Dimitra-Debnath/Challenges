package thirtydays.code.rev;

import java.util.Scanner;

/**
 * The Class SecondDayOperator.
 */
public class SecondDayOperator {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);
		double meal_cost = sc.nextDouble();
		int tip_percent = sc.nextInt();
		int tax_percent = sc.nextInt();
		solve(meal_cost, tip_percent, tax_percent);

		sc.close();

	}

	/**
	 * Solve.
	 *
	 * @param meal_cost   the meal cost
	 * @param tip_percent the tip percent
	 * @param tax_percent the tax percent
	 */
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = round((tip_percent * meal_cost) / 100);

		double tax = round((tax_percent * meal_cost) / 100);

		double bill = meal_cost + tip + tax;
		System.out.println((int) bill);

	}

	/**
	 * Round.
	 *
	 * @param amt the amt
	 * @return the double
	 */
	private static double round(double amt) {
		double roundedAmt = Math.round(amt);
		return roundedAmt;
	}
}
