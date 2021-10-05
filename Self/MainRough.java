package week1.day2;

public class MainRough {
	static String[] name = { "one1", "two", "three" };

	/*
	  1-JVM looks for public static void main(String[] args); Else Error: Main
	  method not found in class Rough.MainRough, please define the main method as:
	  public static void main(String[] args) or a JavaFX application class must
	  extend javafx.application.Application
	 */
	/*public static void main(String[] args) {
		System.out.println("JVM very strictly looks for main because thts how JVM is configured internally");
		 main("Anitha",1);
		 main(name,1);
		 main(1,name);
	}*/
	//2- final,synchornised,strictfp keywords can also be used in main()
	/*public final synchronized strictfp static void main(String[] args) {
		System.out.println("note: JVM accepts final synchronised strictfp keywords while looking for "
				+ "main() first time");
		
	}*/
	//3- vararg- variable arguments to reduce code for method overloading
	
	
	//public static void main(String... string) {
		//System.out.println("string main using var-arg");
	//}
	
	//public static void main(String string...) {
		//System.out.println("not allowed in string main --- var-arg");
	//}
	// 4-main method overloading is allowed

	public static void main(String string, int a) {
		System.out.println("string main");
	}

	public static void main(String[] args, int a) {
		System.out.println("overloading main");
	}

	public static void main(int a, String[] args) {
		System.out.println("overloading main with different order of args");
	}
	//

}
