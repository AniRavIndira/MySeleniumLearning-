package week3.day1;



public class Calculator {

	
		/*
		Classroom 3:
			*Method Overloading*
			Create class Calculator with below methods
			- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args
			- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
			- 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
			- 2 methods to divide , 1 method with 2 int args, 1 method with one double number and one int
			create object for the Calculator class and execute all the methods
			*/
	public void add(int a,int b,int c) {
      System.out.println(a+b+c);
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void multiply(int a,int b) {
		System.out.println(a*b);
	}
	public void multiply(int a) {
		System.out.println(a*a);
	}
	public void multiply(double a) {
		System.out.println(a*a);
	}
	public void subtract(int a,int  b) {
		System.out.println(a-b);
	}
	public void subtract(double a,double b) {
		System.out.println(a-b);
	}
	public void divide(int a,int b) {
		System.out.println(a/b);

	}
	public void divide(double a,int b) {
		System.out.println(a/b);

	}
		
	public static void main(String[] args) {
   
		Calculator obj = new Calculator();
		obj.add(2,2);
		obj.subtract(10.10,5.5);
		obj.multiply(2.5);
		obj.divide(8.4,4);
		
	}

}
