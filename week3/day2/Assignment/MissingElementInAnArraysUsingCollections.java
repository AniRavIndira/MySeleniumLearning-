package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArraysUsingCollections {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
				}
		Collections.sort(lst);
		
		for (int i = 0; i < lst.size(); i++) {
		if (lst.get(i) != (i + 1)) {
			System.out.println("MissingElementInArray " + (i + 1));
			break;
		}
	}
	}
}
