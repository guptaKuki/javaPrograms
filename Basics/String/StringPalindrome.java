package String;

import java.util.Scanner;

public class StringPalindrome {
	
	public static boolean checkPalindrome(String str) {
		boolean flag=false;
		for( int i=0 ,j=str.length()-1;i<=j;i++,j--) {
			if(str.charAt(i) == str.charAt(j))
				flag=true;
			else 
			return flag;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str= s.next();
		boolean check= checkPalindrome(str);
		System.out.println(check);

	}

}
