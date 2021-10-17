package week3.day1.assignment.assign4;

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		System.out.println("Using Replace 8 to 11... "+sentence.replace("king", "queen"));
		String substring = sentence.substring(8,12);
		System.out.println("Using Substring..  "+substring);
		
		System.out.println(sentence.replace(substring, "hello"));
		
		System.out.println("Print the characters from 5 to 14");
		String substring1 = sentence.substring(5,14);
		System.out.println(substring1);
		
/*
 * 3.Write a Java program to replace a specified character with another character and add # to the given string.

String sentence = "I am working with Java8"
replace 8 to 11 
Print the characters from 5 to 14
 */
	}

}
