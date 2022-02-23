package ObjectOrientedProgramming;

public class StudentUse {

	public static void main(String[] args) {
		
		Student s1= new Student(); // Creating new object using new keyword.
		Student s2=new Student(); // both object will create two different block of memory in heap memory having its own set of memories. 
		
		System.out.println(s1); //s1 is the address of object.
		System.out.println(s1.name+" "); //s1.rollNo); //Print default values of 
		
		s2.name="Kuki";
		//s2.rollNo=82; // roll no is private .so, we cannot access outside the class.
		System.out.println(s2.name); 
		
	}

}
