package ObjectOrientedProgramming;

class Car{
	String name;
	private String modelNo;
	
	// Constructor is called when object being created.
	//Constructor doesn't have return type.
	Car(){} //Default Constructor
	
	Car(String name){ //Constructor having one argument.
		this.name=name;
		modelNo="00000";
	}
	
	Car(String name,String modelNo){
		this.name=name;
		this.modelNo=modelNo;
	}
	
	public void print() {
		System.out.println(name+ " "+modelNo);
	}
	
	public void setModelNo(String str) {
		modelNo=str;
	}
	
	public String getModelNo() {
		return modelNo;
	}
}

public class Constructors {

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.print();
		
		Car c2= new Car("Jaguar");
		//c2.setModelNo("ja956N");
		c2.print();
		
		Car c3= new Car("Range Rover", "dju03L");
		c3.print();

	}

}
