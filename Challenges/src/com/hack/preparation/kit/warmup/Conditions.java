package com.hack.preparation.kit.warmup;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		/*
		 * If n is odd, print Weird If n is even and in the inclusive range of 2 to 5,
		 * print Not Weird If n is even and in the inclusive range of 6 to 20, print
		 * Weird If n is even and greater than 20, print Not Weird
		 */

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N % 2 != 0) {
			System.out.println("Weird");

		} else {
			String s = N < 5 ? "Not Weird" : N <= 20 ? "Weird" : "Not Weird";
			System.out.println(s);
		}
		sc.close();
	}

}
