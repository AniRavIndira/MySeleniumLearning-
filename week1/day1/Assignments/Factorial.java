package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Goal: Find the Factorial of a given number
		 * 
		 * input: 5 output: 5*4*3*2*1 = 120
		 */

		int range = 5, fact = 1;
		for (int i = 1; i <= range; i++) {
			fact = fact * i;
			System.out.println("Iteration...i=" + i + "->factorial " + fact);

		}
		System.out.println("Result factorial... " + fact);

	}

}
