package ObjectOrientedProgramming;
import java.util.Scanner;

class Cellphone{
	
	public void print() {
		System.out.println("Cellphone");
	}
}

class SmartPhone extends Cellphone{

	//override
	public void print() {
		System.out.println("SmartPhone");
	}
	public void inherit() {
		System.out.println("Inherited from Cellphone.");
	}
}

class Nokia extends Cellphone{
	
}

public class ClassCast {

	public static void main(String[] args) {
		
		Cellphone c=new Cellphone();
		c.print();
		
		SmartPhone s=new SmartPhone();
		s.print();
		s.inherit();
		
		Cellphone cs=new SmartPhone();  // we can have reference of super class but not ( reference of child class and object of super class)
		cs.print();
		
		//class cast
		Cellphone c2= new SmartPhone();
//		 c2=new Nokia();           // This will give us error of class cast exception.
//		 SmartPhone s2= (SmartPhone)c2;
	}

}

//Method calls are different in overriding it depends on object.
//Method overriding is used for runtime polymorphism and method overloading is used for compile time polymorphism.

	


