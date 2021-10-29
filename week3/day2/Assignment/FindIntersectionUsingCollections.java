package week3.day2.assignment;



import java.util.LinkedHashSet;
import java.util.Set;


public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
		int[] array1 = { 3, 2, 11, 4, 6,7 };
		int[] array2 = { 1, 2, 8, 4, 9,3,7 };

		// creating a new Set
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < array1.length; i++) {
			set.add(array1[i]);
		}
		for (int i = 0; i < array2.length; i++) {
			if (set.contains(array2[i])) {
				System.out.println(array2[i]);
			}

		}

	}
}
