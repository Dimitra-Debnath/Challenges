package thirtydays.code.rev;

import java.util.Scanner;

public class Conditonal3Day {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N;

		N = scan.nextInt();
		


		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scan.close();
		if (N % 2 != 0)
			System.out.println("Weird");
		else {
			if (N >= 2 && N <= 5) {
				System.out.println("Not Weird");
			} else if (N >= 6 || N <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}
		
		
	}

}
