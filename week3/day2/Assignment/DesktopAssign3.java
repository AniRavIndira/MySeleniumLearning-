package week3.day2.assignment;

public class DesktopAssign3 implements HardWareAssign3,SoftwareAssign3  {

	public void hardwareResources() {
		System.out.println("Interface hardware Resources");
	}

	public void softwareResources() {
		System.out.println("Interface software Resources");
	}
	
public static void main(String[] args) {
	
	DesktopAssign3 obj = new DesktopAssign3();
	obj.hardwareResources();
	obj.softwareResources();
	
	
}

}
