package week3.day1.assignment.assign4;

public class JustifyTheOutput {

	public static void main(String[] args) {
		
		
		String str1 = "Kutty";
		
		String str2 = "Kutty";

		String str3 = new String("Kutty");
		String str4 = new String("Kutty");

		if (str3 == str4) {
			System.out.println(" Same text");
		} else
			System.out.println(" memory location of object is different hence str3 != str4");
		
		if (str1 == str2) {
			System.out.println(" memory location of literal is different hence str1 == str2");
		} else
			System.out.println("Diff text");
		System.out.println("***");
         
		
		
		/*
		 * Assignment 5: ============== String str3 = new String("Kutty"); String str4 =
		 * new String("Kutty");
		 * 
		 * if(str3==str4) { System.out.println(" Same text"); } else
		 * System.out.println("Diff text");
		 * 
		 * System.out.println("***"); 👆👆 Justify the above output
		 */
	}

}
