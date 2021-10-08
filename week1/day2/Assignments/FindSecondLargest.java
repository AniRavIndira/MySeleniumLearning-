package week2.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int length1 = data.length;
		System.out.println("Length "+length1);
		Arrays.sort(data);
		System.out.println("Second Largest number..  "+data[length1-2]);
	}

}
