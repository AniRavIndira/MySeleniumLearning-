package week3.day1;

public class MyExtension {

	public static void main(String[] args) {
  
		System.out.println("----BMW-------");
		BMW obj1=new BMW();
		System.out.println("BMW methods are.....");
		obj1.driveVehicle();
		obj1.accelerate();
		obj1.applyBrake();
		obj1.fillFuel();
		obj1.shiftGear();
		System.out.println("\n");
		
		System.out.println("----Audi-----");
		Audi obj2= new Audi();
		System.out.println("Audi methods are....");
		obj2.shiftGear();
		obj2.enableAirBag();
		obj2.closeDoor();
		System.out.println("\n");
		
		System.out.println("----Mahindra-----");
		Mahindra obj3= new Mahindra();
		System.out.println("Mahindra Variable is....");
		System.out.println("Variable from Auto in Child Mahindra"+obj3.wheelAuto);
		System.out.println("\n");
		
		Auto obj4= new Auto();
		System.out.println("---Auto-------");
		System.out.println("Auto methods are....");
		obj4.shiftGear();
		System.out.println("\n");
		
		Bajaj obj5= new Bajaj();
		System.out.println("---Bajij-------");
		System.out.println("Bajaj methods are....");
		obj5.shiftGear();
		System.out.println("\n");
		
		
		
		
	}

}
