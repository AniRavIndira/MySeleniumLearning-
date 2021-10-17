package week3.day1.assignment.assign4;

public class StringIgnoringCase {

	public static void main(String[] args) {
		
		        String str1="I am Learning Java";
				String str2="I am Learning java";
				
				if(str1.equalsIgnoreCase(str2))
				{
					System.out.println("equalsIgnoreCase ignores the case and returns TRUE");
				}
				else {
					System.out.println("equalsIgnoreCase  returns false");
				}
				if(str1.equals(str2))
				{
					System.out.println("equals RETURNS True");
				}
				else {
					System.out.println("equals  returns false because String is case sensitive");
				}
				if(str1==str2)
				{
					System.out.println(" == returns TRUE for String literal as memory is compared .. this not possible when there is mismatch in String case ");
				}
				else {
					System.out.println("== returns false for String Literal memory location due to diff memory location(Mismatching Cases in String) ");
				}
/*
 * 
 * 2.Write a Java program to compare a given string to another string, ignoring case considerations.

String 1="I am Learning Java" 
String 2="I am learning java?   
**  Explore with == operator
**               equals
**               equalsignorecase 
 * */
 
	}

}
