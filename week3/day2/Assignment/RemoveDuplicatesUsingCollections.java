package week3.day2.assignment;


import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
	String[] string = text.split(" ");
			Set<String> strtext = new LinkedHashSet<String>();
		for (String string1 : string) {
			strtext.add(string1);
				}
		System.out.println(strtext);
	}

}
