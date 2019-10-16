package thirtydays.code.rev;

import java.util.Scanner;

public class Day9Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter");
		int n = in.nextInt();
		int fact = factorial(n);
		System.out.println(fact);
		in.close();
	}

	static int factorial(int n) {
		int fact = 1;
		if (n == 0) {
			return 1;
		} else {
			while (n >= 1) {
				fact = n * fact;
				n--;
				factorial(n);
			}
		}
		return fact;
	}
}
