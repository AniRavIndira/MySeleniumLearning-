package week2.day2.assignments;

//import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		//This code also works
		/*
		 *
		 * int[] arr1 = {14,12,13,11,15,14,18,16,17,19,18,17,20}; Arrays.sort(arr1);
		 * System.out.println("Repeated elements in Array..."); for (int i = 0; i <
		 * arr1.length-1; i++) { if(arr1[i]==arr1[i+1]) { //System.out.println("----");
		 * System.out.println(arr1[i]); }
		 * 
		 * }
		 */

		int[] arr1 = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println("Repeated elements in Array.." + arr1[j]);
				}
			}
		}

	}

}
