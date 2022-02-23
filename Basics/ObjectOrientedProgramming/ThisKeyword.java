package ObjectOrientedProgramming;

class College{
	String name;
	private int clgCode;
	
	public void setCode(int n) {
		this.clgCode=n;
	}
	public int getCode() {
		System.out.println("this :"+this);
		return this.clgCode; //Here this is a keyword that refers to current object
	}
	
	public void setName(String str) {
		this.name=str;
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		College c1= new College();
		College c2= new College();
		
		c1.setName("Academy of technology");
		c1.setCode(534);
		
		System.out.println("c1 :"+c1);
		System.out.println(c1.name+" "+c1.getCode());
		
		System.out.println("c2 :"+c2);
		c2.getCode();
		c2.setName("Haldia Institute of technology");
		System.out.println(c2.name);
	}

}
