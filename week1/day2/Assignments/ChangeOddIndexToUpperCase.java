package week2.day2.assignments;



public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] test1 = test.toCharArray();
		for (int i = 0; i < test1.length; i++) {
			if (i % 2 == 0) {//checking odd position in given string
				 test1[i]= Character.toUpperCase(test1[i]);
		}
				
		}System.out.println("Changing odd index toUpper case.. "+(new String(test1)));
		
		}
			}