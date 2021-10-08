package week2.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = " 1A~";
		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) Find if the given character is what type using (if)
					i)  Character.isLetter
					ii) Character.isDigit
					iii)Character.isSpaceChar
					iv) else -> consider as special character
							*/
		char[] charArray1 = test.toCharArray();
		int digit=0,letter=0,space=0,special=0;
		for (int i = 0; i < charArray1.length; i++) {
			if(Character.isDigit(charArray1[i])) {
				digit++;
			}
			else if(Character.isLetter(charArray1[i])) {
				letter++;
				}
			else if(Character.isSpaceChar(charArray1[i])) {
				space++;
				}
			else
			{
				special++;
			}
			
			}
		System.out.println("Digit count: " + digit);
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Space: " + special);
		}
}		
		