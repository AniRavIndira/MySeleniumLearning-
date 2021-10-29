package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharOccurnceUsingCharAt {

	public static void main(String[] args) {
String str="Hello world";
Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
for (int i = 0; i < str.length(); i++) {
	if(map.containsKey(str.charAt(i)))
			{
		Integer value = map.get(str.charAt(i));
		map.put(str.charAt(i), value+1);
			}
	else
	{
		map.put(str.charAt(i),1);
	}
	
}
System.out.println(map);


		
	}

	
	}


