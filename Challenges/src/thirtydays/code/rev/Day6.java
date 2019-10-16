package thirtydays.code.rev;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for (int i = 1; i <= n; i++) {
			String even,odd;
			even=odd="";
			String myString = sc.nextLine();
			manipulation(even,odd, myString);
		}
		sc.close();
	}
	
	public static void manipulation(String even, String odd, String myString) {
		char ch[]= myString.toCharArray();
		
		for(int j=0;j<ch.length;j+=2) {
			even = even + ch[j];
		}
		for(int k=1;k<ch.length;k+=2) {
			odd = odd + ch[k];
		}
		String s = even + " "+ odd;
		System.out.println(s);
	}

	
}
