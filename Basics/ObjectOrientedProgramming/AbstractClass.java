package ObjectOrientedProgramming;

abstract class  A{
	public abstract void display();
}

class B extends A{
	int j;
	@Override
	// if A class is abstract and extends to another class then we must override the abstract methods.
	public void display() {
		System.out.println("Display "+j);
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// A a=new A(); // we cannot make an object of A bcz it is a abstract class.
		 
		B b = new B();
		b.j=10;
		b.display();
	}

}
