package String;

public class StringPractice {

	public static void main(String[] args) {
		
		String str1="java program"; // This literal is stored in pool memory
		
		String str2=new String("JAVA"); // This new object is stored in heap
		
		char c[] = {'H','E','L','L','O'};
		String str3= new String(c);
		
		byte b[]= {65,66,67,68};
		String str4 =new String(b,1,2);
		
		System.out.println(str4);
		
		String str5="java program";
		System.out.println(str1 == str5); // THis will give us that in pool str1 and str5 indicate the same string or different ( having same references)
	}

}
