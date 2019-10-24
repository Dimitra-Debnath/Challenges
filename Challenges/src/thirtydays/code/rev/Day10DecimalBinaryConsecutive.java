package thirtydays.code.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Day10DecimalBinaryConsecutive {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int rem = 0, s = 0, t = 0;

		while (n > 0) {
			rem = n % 2;
			n = n / 2;
			if (rem == 1) {
				s++;
				if (s >= t)

					t = s;

			} else {

				s = 0;
			}
		}

		System.out.println(t);

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter"); int n = scanner.nextInt(); binary(n);
		 * scanner.close(); }
		 * 
		 * static void binary(int n) { int c=0, count1 = 0, count = 0, d = 0;
		 * List<Integer> list = new ArrayList<>(); while (n > 0) { d = n % 2; n = n / 2;
		 * list.add(d); }
		 * 
		 * Collections.reverse(list); list.stream().collect(Collectors.) c++; }
		 * System.out.println(c);
		 */
		/*
		 * Integer[] ar = new Integer[list.size()]; ar = list.toArray(ar);
		 * 
		 * for (int i = 0; i < ar.length - 1; i++) { if (ar[i] == 1) { count1++; } if
		 * (ar[i] == 1 && ar[i] == ar[i + 1]) { count++; }
		 * 
		 * } if (count1 == 1) System.out.println(count1); else if (count != 0) { if
		 * (count1 % 2 != 0) { System.out.println(count + 1); } else {
		 * System.out.println(count); }
		 * 
		 * }
		 */
	}
}
