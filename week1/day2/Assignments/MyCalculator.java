package week2.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		System.out.println("**Calling from 2nd class**");
   Calculator obj =new Calculator();
   int add = obj.add(10, 20, 30);
   int sub = obj.sub(30, 15);
   double mul = obj.mul(11111111,2);
   float divide = obj.divide(8.4f, 4.3f);
   
   System.out.println("...Add.. "+add);
   System.out.println("...Sub.. "+sub);
   System.out.println("...Mul.. "+mul);
   System.out.println("...Divide.. "+divide);

   

   
	}

}
