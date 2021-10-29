package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrainNames {

	public static void main(String[] args) {

		  List<String> trainName= new ArrayList<String>();
		  // alternate : List<String> trainName = Arrays.asList("","","")
		  // List is an interface
		  // ArrayList is a concrete class
		  
		  trainName.add("August Kranti Rajdhani Express");
		  trainName.add("Vantika Express");
		  trainName.add("Zad Hind Express");
		  trainName.add("SBS Express");
		  trainName.add("SBS Express");
		  	
		  Collections.sort(trainName);
		  System.out.println(trainName);
		  //last but one train
		 int size = trainName.size();
		  System.out.println(trainName.get(size-2));
		  
	
	}

}
