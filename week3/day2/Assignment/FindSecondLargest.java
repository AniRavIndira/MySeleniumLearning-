package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,9,7};
		
		List<Integer> lst = new ArrayList<Integer>();
		for (Integer integer : data) {
			lst.add(integer);
		}
    Collections.sort(lst);
    int size = lst.size();
    System.out.println("Second largest number using List: "+lst.get(size-2));
	}

}



// Here is the input
//	int[] data = {3,2,11,4,6,7};


/*
 Pseudo Code:
 1) Arrange the array in ascending order
 2) Pick the 2nd element from the last and print it
 */
