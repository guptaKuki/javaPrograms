package ObjectOrientedProgramming;

// An interface is pure abstract class having all method is abstract type.
interface  Pc{
	
	public final static double PI=3.15; // if we want initialize any variable in interface class then we need to give final and static type both.
	public void notepad();
	public void camera();
	default void meth3() {
		
	}
	
	private void meth4() {
		
	}
}
 
// A class can implement as many class as it want.
class Laptop implements Pc{
	public void notepad() {
		System.out.println("Laptop ");
	}
	public  void camera() {
		System.out.println("Open camera");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		Pc p= new Laptop(); 
		//When we make a object of interface class holding a object of implemented class then we can call only those methods which are present in interface class.
		
		p.notepad();
		p.camera();
	}
}
