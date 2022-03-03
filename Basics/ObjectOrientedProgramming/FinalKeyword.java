package ObjectOrientedProgramming;

/*We can make methods and class final as well . when a method is made final then we cannot override the function.  
 * and when we made a class as final class then we cannot inherit */

//final class Parent{  as we made it final we cannot inherit this anywhere
class Parent{
	Parent(){
		System.out.println("parent constructor");
	}
	
	public final void show() {
		System.out.println("Show function");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child constructor");
	}
	
	//public void show()  we cannot override the show method as it is final method
	public void childShow(){
		System.out.println("Show function of child class");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		 Parent p= new Child();
		 p.show();

	}

}
