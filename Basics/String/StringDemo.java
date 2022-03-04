package String;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
		char c[]= {'C','O','D','I','N','G'};
		
		String	 temp =	"Java is Amazing!"; //	 Implicit	 construction	 via	 string	literal
		String	temp2 =	new	String("Java is	Cool!");	//	Explicit	construction	via	new
		
		
		String str="Coding";
		
		String str2=""; // it has no character b/w "" but when we give space the string length is 1.
		System.out.println(str.length());
		System.out.println(str2.length());
		
		System.out.println(str.charAt(3));
		Scanner s= new Scanner(System.in);
		String str3 = s.next(); // it stop taking input when it find any delimeter.
		String str4 = s.nextLine(); // it reads till '\n' is encountered
		System.out.println(str3);
		System.out.println(str4);
		
		s.close();
	}

}
