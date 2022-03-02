package ObjectOrientedProgramming;

/*Constructor is a special method that is called when an object 
is instantiated i.e created.*/

/*We can have more than one constructors within the same class (i.e 
constructor overloading), which constructor will be called will be decided on 
runtime depending on the type and number of arguments specified while 
creating the object*/
class JNV{
	String name;
	JNV(String name){
		System.out.println(" JNV Constructor");
		this.name= name;
	}
	public  void print() {
		System.out.println("JNV "+name);
	}
}

class District extends JNV{
	String disName;
	District(String disName ,String name){
		super(name); 
		// As we have extended the District class from jnv and jnv has a constructor having parameter so we need to pass parameter using super keyword.
		System.out.println("District's Constructor");
		this.disName=disName;
	}
	public void print() {
		System.out.println(name+" "+disName);
	}
}

public class InheritanceandConstructor {

	public static void main(String[] args) {
	
		JNV j= new JNV("Rajgir");
		j.print();
		
		District d= new District("Nalanda" , "JNV");
		d.print();
	}

}
