package week2.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to CHIDaMBARAM";
		
		//check for'a'
		
		char[] cs = str.toCharArray();
		int count=0;
		for (int i = 0; i < cs.length; i++) {
			
			if((cs[i]=='a')||(cs[i]=='A')) {
				count++;			
			}				
		}
		System.out.println(""+count);
			
		}
		
	}


