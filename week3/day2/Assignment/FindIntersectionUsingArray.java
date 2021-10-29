package week3.day2.assignment;

public class FindIntersectionUsingArray {

	public static void main(String[] args) {
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[i] == array2[j]) {
						System.out.println(array1[j]);
					}
				}
			}
		}
	}

}

/*
 * Pseudo Code
 * 
 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
 * a nested for another array from 0 to array length e) Compare Both the arrays
 * using a condition statement
 * 
 * f) Print the first array (shoud match item in both arrays)
 */