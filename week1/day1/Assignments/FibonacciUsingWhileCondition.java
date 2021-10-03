package week1.day1.assignments;

public class FibonacciUsingWhileCondition {

	

			public static void main(String[] args) {
				int range = 8, firstNum = 0, secNum = 1, sum=0;

				System.out.println(firstNum);// To print the first value 0
				System.out.println(secNum);//to print second number


				int i = 0;
				
				while (i < range) {//for, while are iterative /looping statements 
					//If clause should not be used here because if is selection statements
					sum = firstNum + secNum;
					System.out.println(sum);
					firstNum = secNum;
					secNum = sum;
					
					i++;	
				}
				
				

			}}
		

	


