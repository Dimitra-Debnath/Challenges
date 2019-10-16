package thirtydays.code.rev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Day10DecimalBinaryConsecutive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter");
		int n = in.nextInt();
		int rem = binary(n);
	//	System.out.println(n);
		in.close();
	}

	static int binary(int n) {
		int rem = 0, div = 0, i = 1;
		HashMap<Integer, Integer> maps = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();
		while (n > 0) {
			rem = n % 2;
			div = n / 2;
			maps.put(i, rem);
			list.add(rem);
			i++;
			binary(div);

		}
		
		
		
		return rem;
	}

}
