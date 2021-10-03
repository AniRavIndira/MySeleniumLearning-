package week1.day1;

public class PositiveOrNegative {
                                    
	// To check positive or negative number
	public static void main(String[] args) {
		int num = -10;
		System.out.println("Postive or Negative number...");
		if (num > 0) {
			System.out.println("Positive number..."+num);
		} else if (num < 0) {
			System.out.println("Negative number..."+num);
		} else {
			System.out.println("Neutral number");
		}
	}

}
