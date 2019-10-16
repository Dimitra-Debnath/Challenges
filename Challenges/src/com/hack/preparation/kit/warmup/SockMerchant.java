package com.hack.preparation.kit.warmup;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Set<Integer> colors = new HashSet<>();
		for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
		//int result = sockMerchant(n, ar);
	}
	public SockMerchant() {
		// TODO Auto-generated constructor stub
	}
}
