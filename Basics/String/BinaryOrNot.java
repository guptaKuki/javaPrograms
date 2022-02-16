package String;

public class BinaryOrNot {

	public static void main(String[] args) {
		int i=1101110010;
		String str="";
		str=str.valueOf(i);  //convert int into string
		System.out.println(str); 
		
		String str2="123AB";
		String str3="12/05/1999";
		
		System.out.println("Number is binary or not :" + str.matches("[01]*")); 
		 // This .matches(sting) matches the given string with the argument passes in matches method
		// [01]* matches the string whether it is 0 or 1 and '*' multiple times.
		
		System.out.println("number is hexa :"+ str2.matches("[0-9 A-F]+"));
		
		System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}+"));

	}

}
