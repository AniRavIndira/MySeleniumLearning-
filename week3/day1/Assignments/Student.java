package week3.day1.assignment.assign4;

public class Student {

	public void getStudentInfo(int id) {
		System.out.println("Passing id argument alone.. " + id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Passing id & name.. " + id +" , "+ name);
	}

	public void getStudentInfo(String email, Long  phoneNumber) {
		System.out.println("Passing by email & phoneNumber.. " + email +" , "+ phoneNumber);
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.getStudentInfo(2);
		obj.getStudentInfo(23, "Ravi");
		obj.getStudentInfo("anithamyofficial@gmail.com", 9876543234521l);

	}

}

/*
 * Assignment 4: ==============
 * 
 * Class: Students Methods: getStudentInfo()
 * 
 * Description: Create multiple getStudentInfo() method by passing id argumentalone, by id & name, by email & phoneNumber
 * 
 */