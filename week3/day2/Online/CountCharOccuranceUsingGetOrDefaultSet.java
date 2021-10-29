package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharOccuranceUsingGetOrDefaultSet {

	public static void main(String[] args) {
 String str="Hello world";
 char[] charArray = str.toCharArray();
 Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
for (int i = 0; i < charArray.length; i++) {
	if(map.containsKey(charArray[i]))
	{
		Integer value = map.getOrDefault(charArray[i], 0);
		map.put(charArray[i], value+1);
	}	
	else {
	map.put(charArray[i],1);
}
}
System.out.println(map);
	}

}
