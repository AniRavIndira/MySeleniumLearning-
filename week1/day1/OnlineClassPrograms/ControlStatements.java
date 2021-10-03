package week1.day1;

public class ControlStatements {

	public static void main(String[] args) {
		
		/*ClassRoom:Task-1
			Get an integer
			int num = 21;
			If the number is divisible by 3, print as TRIZZ
			If the number is divisible by 5, print as FIZZ
			If the number is divisible both by 3 and 5, print as TRIZZ-FIZZ
			else
			not divisible both by 3 or 5*/
			
			System.out.println("Get an Integer....");
			int num=2;
			if (num%3==0 && num%5==0) {
				System.out.println("TRIZZ-FIZZ");
			}
			else if(num%5==0) {
				System.out.println("FIZZ");
				
			} 
			else if (num%3==0){
				System.out.println("TRIZZ");
				
			}else {
				System.out.println("not divisible both by 3 or 5");
			}

	}

}
