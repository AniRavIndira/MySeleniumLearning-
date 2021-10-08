package week2.day2.assignments;



public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code a) Declare An array for {3,2,11,4,6,7}; 
		 * b) Declare another array for {1,2,8,4,9,7}; 
		 * c) Declare for loop iterator from 0 to array length 
		 * d) Declare a nested for another array from 0 to array length 
		 * e) Compare Both the arrays using a condition statement 
		 * f) Print the first array (shoud match item in both arrays)
		 */

		int array1[] = { 3, 2, 11 };
		int array2[] = { 1, 2, 5, 4, 9, 7, 10, 3 };

		System.out.println(array1.length);
		System.out.println(array2.length);
		for (int i = 0; i < array1.length; i++) {
			// System.out.println("array 1.iteration i... " + array1[i]+"....");
			for (int j = 0; j < array2.length; j++) {
				// System.out.println("array 2..j iter.. " + array2[j]);
			
				if (array1[i] == array2[j]) {
			
						System.out.println("oooooo");
					System.out.println("In Array1 " + array1[i] + " is intersection");
					System.out.println("In Array2 " + array2[j] + " is intersection");
				}

			}

		}
	
	
}}