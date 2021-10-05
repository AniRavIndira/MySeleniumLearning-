package week1.day2;

public class MyMobile {

	// Instance variable
	int size = 13;
	String Colour = "White";

	// Create methods

	public void makecall() {
		System.out.println("calling...");

	}

	public void sendMsg() {
		System.out.println("sending msg...");
	}

	private void payBills() {
		System.out.println("Bill Payment remains secret....");
	}

	public static void main(String[] args) {

		MyMobile obj = new MyMobile();
		System.out.println(obj.size);
		System.out.println(obj.Colour);
		obj.makecall();
		obj.sendMsg();
		obj.payBills();
	}
}
