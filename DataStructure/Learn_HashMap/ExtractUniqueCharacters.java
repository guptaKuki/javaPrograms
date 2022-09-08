package Learn_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueCharacters {
	
	public static String extractUnique(String str) {
		if(str == "")
			return null;
		
		HashMap<Character , Boolean> map= new HashMap<>();
		String ans="";
		
		for( int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				ans+=str.charAt(i);
				map.put(str.charAt(i), true);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str= sc.next();
		
		str=extractUnique(str);
		System.out.println(str);
	}

}
