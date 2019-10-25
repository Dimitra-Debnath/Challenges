package thirtydays.code.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Day112DArray {

	public static void main(String[] args) {
		int i, j;
		int a[][] = new int[6][6];
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 6; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum[] = new int[16];
	    int h = 0;
	    for ( i = 0; i < 4; i++) {
	        for ( j = 0; j < 4; j++) {
	            sum[h] = a[i][j] + a[i][j+1] + a[i][j+2]
	                    + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1]
	                    + a[i+2][j+2];
	            h++;
	        }
	    }
	    Arrays.sort(sum);
	    System.out.println(sum[15]);
		
		sc.close();
	}

}
