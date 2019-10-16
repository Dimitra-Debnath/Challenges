
/*Reverse the Array*/

package thirtydays.code.rev;

import java.util.Scanner;

public class Day7Arrays {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the number of items");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + (i + 1) + " th element of the array");
			arr[i] = scanner.nextInt();

		}
		int j = n-1;
		int i= 0, temp =0;
		reverse(arr, i ,j, temp);

		scanner.close();
	}

	public static void reverse(int arr[], int i, int j , int temp) {
		
		

		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int k =0; k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
		
		/* if its Integer instead of int it will work
		 * List<int[]> l = Arrays.asList(arr);
		System.out.println(l.stream().map(String :: valueOf).collect(Collectors.joining(" ")));*/

	}
}
