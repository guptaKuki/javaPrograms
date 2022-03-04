package String;

import java.util.Scanner;

public class ReverseString {
	
	public static String reverse(String str) {
		String temp ="";
		
		for( int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
		 String str= s.nextLine();
		String reversed=reverse(str);
		System.out.println(reversed);
		 s.close();

	}

}
