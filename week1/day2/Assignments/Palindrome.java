package week2.day2.assignments;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// Step1:  Palindrome is at char level so we change String to Char Array
		// Step2: Reverse the string- go to last element 
		//        place it in another char array whose length is same as given string
		//Step 3: Place each char in new array one by one
		String str1 = "qwerttrewq";
		char[] charArray = str1.toCharArray();
		int length2 = charArray.length;
		char[] charArray1 = new char[length2];
		int j = 0;
		for (int i = length2 - 1; i >= 0; i--) {
			// System.out.println("charArray[i] "+charArray[i]);
			charArray1[j] = charArray[i];
			j++;
		}
		System.out.println("Given String - " + Arrays.toString(charArray));
		System.out.println("Reversed String - " + Arrays.toString(charArray1));
		System.out.println("....");
		// if(charArray.equals(charArray1)) {// this compares memory address
		if (Arrays.equals(charArray, charArray1)) {// This compares value
			System.out.println(str1 + " is a PALINDROME ");
		} else {
			System.out.println(str1 + "  is not a PALINDROME ");
		}
	}
}

/*
 * index=0 is first element , length-1 is the index of last element
 */