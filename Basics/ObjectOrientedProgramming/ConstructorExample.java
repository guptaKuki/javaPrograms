package ObjectOrientedProgramming;


class Example{
	int a;
	int b;
	
	Example(){
		this(10,20);  
		System.out.println("Constructor One");
	}
	
	Example( int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("Constructor two");
	}
}
public class ConstructorExample {

	public static void main(String[] args) {   
		Example ex= new Example();
	}
}


/*When the object of Class Example is created .
 * The Constructor wit no argument is called. when this(10,20)
 * is encountered , the constructor with two argument int and int is 
 * called because this is the reference of the object . So, using this way
 * we can call more than one constructor.  */