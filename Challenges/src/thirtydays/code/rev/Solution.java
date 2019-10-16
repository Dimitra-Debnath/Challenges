package thirtydays.code.rev;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int a;
		double b;
		String c = null;

		a = scan.nextInt();
		b = scan.nextDouble();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		c = scan.nextLine();

		System.out.println(c);
		scan.close();
		System.out.println(a + i);
		System.out.println(b + d);

		System.out.println(s.concat(c));

		/* Declare second integer, double, and String variables. */

		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */

		/* Print the sum of the double variables on a new line. */

		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

	}
}