package thirtydays.code.rev;

import java.util.Scanner;

public class FouthDay {
	private int age;

	public FouthDay(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge > 0) {
			age = initialAge;

		} else {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");

		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct
		// statement:
		String s = age < 13 ? "You are young.."
				: age >= 13 ? (age >= 18 ? "You are old.." : "You are a teenager..") : "You are a teenager..";

		System.out.println(s);
	}

	public void yearPasses() {
		// Increment this person's age.
		age = age + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			FouthDay p = new FouthDay(age);
			if (age <= 0) {
				age = 0;
			}

			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}

			p.amIOld();
			System.out.println();
		}

		sc.close();

	}

}
