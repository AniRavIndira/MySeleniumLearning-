package week3.day1.assignment.assign1;

public class SingleInheritance {

	public static void main(String[] args) {

		
		Desktop obj1 =new Desktop();
		System.out.println("calling child class method using child class object");
		obj1.desktopSize();
		System.out.println("Calling parent class method using child class object ");
		obj1.computerModel();
		System.out.println("*********");
		
		Computer obj2=new Computer();
		System.out.println("child class method cannot be called using Parent class object");
		//obj2.desktopSize();
		System.out.println("Calling parent class method using parent class object ");
		obj2.computerModel();
	}

}
