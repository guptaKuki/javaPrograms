package String;

public class FindGivenString {

	public static void main(String[] args) {
		String str= "Programmer@gmail.com";
		
		int l=str.length();
		 
		int i= str.indexOf('@');
		String user=str.substring(0, i);
		String domain = str.substring(i+1, l);
         
		System.out.println("username :"+user);
		System.out.println("Domainname :"+domain);
		
		System.out.println(domain.startsWith("gamil"));
	}

}
