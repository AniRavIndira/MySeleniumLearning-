package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharOccurance {

	public static void main(String[] args) {

		String str = "Today is sunday";
		char[] charArray = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i]) == true) {
				Integer value = map.get(charArray[i]);
				map.put(charArray[i], value + 1);
				
			} else {
				map.put(charArray[i], 1);
			}
		}
		System.out.println(map);
	}

}
