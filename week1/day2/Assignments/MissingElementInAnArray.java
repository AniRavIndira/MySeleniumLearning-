package week2.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 1, 3, 4, 10, 7, 5, 6, 8 };
		// Sort the array
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		System.out.println("*******");
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) != arr[i]) {
				System.out.println("MissingElementInArray " + (i + 1));
				break;
			}
	}
	}}
