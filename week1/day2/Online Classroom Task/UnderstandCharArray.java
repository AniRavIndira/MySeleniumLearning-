package week1.day2;

public class UnderstandCharArray {

	
	public static void main(String[] args) {
		String hello = "Welcome to Chidamabaram";
		char[] hello1 = hello.toCharArray();
		int count = 0;
		for (int i = 0; i < hello1.length; i++) {
			
			if (hello1[i] == 'a') {
				count++;
			}
			
		}
		System.out.println(count);
	}
	
}
