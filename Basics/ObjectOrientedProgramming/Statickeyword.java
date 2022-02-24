package ObjectOrientedProgramming;

class Branch{
	static int students;  
	// Static properties are those properties that are shared by all object.
	int batch;
	String name;
	final static String COLLEGENAME="Academy of Technology"; // we can use final and static together
	
	Branch(String name, int batch){
		this.name= name;
		this.batch=batch;
		students++;
	}
	
}

public class Statickeyword {

	public static void main(String[] args) { 
		
		//we cannot access non-static properties within a static function.
		//System.out.println(Branch.name);
		
		Branch b1= new Branch("CSE",1);
		Branch b2= new Branch("IT",1);
		Branch b3= new Branch("ECE",2);
		
		System.out.println(b1.students); //this is not a correct way of accessing static variable.
		
		System.out.println(Branch.students); // using class name is appropriate way to access.
		
		System.out.println(b1.COLLEGENAME+" CSE");
		System.out.println(b2.COLLEGENAME+" IT");
	}

}
