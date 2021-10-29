package week3.day2;

import java.util.HashSet;
import java.util.Set;


public class DuplicatesUsingSet {

	public static void main(String[] args) {

		int[] numbers = { 10, 24, 32, 10, 64, 85, 240, 37, 12 };
		Set<Integer> setobj = new HashSet<Integer>();
		Boolean isduplicate = true;
		// for example
		for (int i = 0; i < numbers.length; i++) {
			boolean add = setobj.add(numbers[i]);
			// check whether any duplicate is there or not
			if (add == false) {
				// if the given number has any duplicate, print it
				System.out.println("Duplicate found...: " + numbers[i]);
				isduplicate = false;

			}

		}
		if (isduplicate == true) {
			System.out.println("No Duplicate...");
		}
	}
}
