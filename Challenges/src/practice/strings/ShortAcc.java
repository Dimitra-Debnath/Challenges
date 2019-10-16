package practice.strings;

import java.util.Scanner;

public class ShortAcc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Account number");
		String s = sc.nextLine();
		System.out.println(getShortAccountNo(s));
		sc.close();
	}

	private static String getShortAccountNo(final String accountNum) {
		String trimmedAccNum = accountNum.replaceAll("\\s", "");
		String shortAccNum;
		if (trimmedAccNum.length() >= 4) {
			shortAccNum = trimmedAccNum.substring((trimmedAccNum.length() - 4), trimmedAccNum.length());
		} else {
			shortAccNum = trimmedAccNum;
		}
		return shortAccNum;

	}
}
