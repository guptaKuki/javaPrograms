package String;

import java.util.Scanner;

public class CountWords {
	
	public static int count(String str) {
		int c=1;
		if(str.length() == 0)
			return 0;
		
		for( int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ')
				c++;
		}
		return c;
	}
	
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
		String str= s.nextLine();
		 int spaces = count(str);
		 System.out.println(spaces);
		 s.close();
	}

}
