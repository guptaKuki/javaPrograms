package TempOop;

import ObjectOrientedProgramming.Student; // if we want to use a class of different package we need to import it.

public class StudentUse2 {

	public static void main(String[] args) {
		
		Student s1= new Student();
		//s1.name(); // Default access modifier is not visible in different packages.
		s1.Dept="ECE"; // we can access this because this is public.
		
	}
}
