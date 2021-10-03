package week1.day1.assignments;

/*
 * Goal: To find Fibonacci Series for a given range
 * 
 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13*/

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1,sum=0;

		System.out.println(firstNum);// To print the first value 0
		System.out.println(secNum);//to print second number


		
		   for (int i = 0; i < range; i++) {
		     sum =firstNum+secNum;
		    System.out.println(sum);
		  firstNum=secNum; 
		  //secNum=firstNum;This is incorrect because we are pushing the values towards left 
		  secNum=sum;
		  //sum=secNum; This is incorrect because we are pushing the values towards left
		  }}
}
