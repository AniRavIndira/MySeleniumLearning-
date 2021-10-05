package week1.day2;

import java.util.Arrays;

public class LearnArray {

	
	public static void main(String[] args) {
/*
 * Classroom:
----------
int arr[] = {100,49,398,34,1,267};
1. Find the second largest number:
2. Find the second smallest number:
 */
		int arr[] = {100,49,398,34,1,267};
		int len=arr.length;
		System.out.println("Length of the Array..."+len);
		System.out.println("****Before Sorting*****");
		for (int i = 0; i < arr.length; i++) {			
		System.out.println(arr[i]);}
		Arrays.sort(arr);//to sort the array
		System.out.println("****After Sorting*****");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);}	
		System.out.println("Second largest number......"+arr[len-2]);
		System.out.println("Second smallest number......."+arr[1]);
	}

}
