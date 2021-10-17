package week3.day1.assignment.assign3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println(" deposit-override");
	}
	
	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		obj.deposit();
		}
	
}


/*
 * 
 * Assignment3: ============ Class :BankInfo Methods :saving(),fixed(),deposit()
 * 
 * Class :AxisBank Methods :deposit()
 * 
 * Description: You have to override the method deposit in AxisBank.
 * 
 */
