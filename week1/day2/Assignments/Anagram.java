package week2.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		  *Declare a String 
		*Declare another String
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "Listen";
		String text2 = "siLent";
		if(text1.length()==text2.length()) {
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean checkequals = Arrays.equals(charArray1, charArray2);
			
			if(checkequals==true)
			{System.out.println(" Given strings are Anagram ");}
			else
			{System.out.println(" Given strings are NOT Anagram ");}
		}
		else
		{System.out.println(" Given strings are cannot be Anagram due toincorrect length ");
		}}

}
