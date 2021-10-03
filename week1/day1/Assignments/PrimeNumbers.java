package week1.day1.assignments;

public class PrimeNumbers {

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		int Input = 8;
		// Declare a boolean variable flag as false
		Boolean flag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= Input / 2; i++) {
			// Divide the input with each for loop variable and check the remainder

			if (Input % i == 0) {
				// Set the flag as true when there is no remainder
				flag = true;
				// break the iterator
				break;
			}
		}
		// Check the flag (Provide a condition)
		if (!flag)//if (flag=false)
			System.out.println(Input + " is a prime number.");
		// Print 'Prime' when the condition matches
		else
			System.out.println(Input + " is not a prime number.");
		// Print 'Not a Prime' when the condition doesn't match
	}
}
