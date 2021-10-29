package week3.day2.assignment;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "PayPal India";
		char[] charArray = str.toCharArray();

		Set<Character> setchar = new LinkedHashSet<Character>();
		Set<Character> dupsetchar = new LinkedHashSet<Character>();
		
		for (Character character : charArray) {
			//System.out.println("*************new Character******"+character);
						boolean add = setchar.add(character);
						//System.out.println(add);
						//System.out.println(setchar);
						if(add==false) {
							//boolean add1 = 
									dupsetchar.add(character);
							//System.out.println("____");
							//System.out.println(add1);
							//System.out.println(dupsetchar);	
							//System.out.println("-----");
						}
		}						
						System.out.println(setchar);
						for (Character character1 : setchar) {
							System.out.println(character1);
							
						}
	}}		
	
		


//Declare a String as PayPal India
//1.Convert it into a character array
//2.Declare a Set as charSet for Character
//3.Declare a Set as dupCharSet for duplicate Character
//4.Iterate character array and add it into charSet
//5.If the character is already in the charSet then, add it to the dupCharSet
//6.Check the dupCharSet elements and remove those in the charSet
//7.Iterate using charSet
//8.Check the iterator variable isn't equals to an empty space
//9.print it