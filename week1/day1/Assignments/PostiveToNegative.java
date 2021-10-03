package week1.day1.assignments;

public class PostiveToNegative {

	public static void main(String[] args) {

		/*Problem statement: Convert a negative number to positive number
		---------------------------------------------------------------
		Pseudocode:
		-----------
		1. Initialize an integer with a negative number
		   like, int number = -40;
		2. Check if the number is a negative number 
		   Hint : any number that is lesser than zero is a negative number
		3. If so, convert the number to a positive numer*/
		
		int number = -960,number1=0;
		
		if(number<0)
		{
			number1=~(number-1);//Bitwise Compliment operator is used
			System.out.println(number1);
		}
	}

}
