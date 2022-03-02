package ObjectOrientedProgramming;


// If we want to create our own Exception class 
class DivideByZero extends Exception{
	
}


public class ExceptionThrown {

	public static int divide(int a,int b) throws Exception {
		if(b ==0) {
			throw new ArithmeticException();
		}
		return a/b;
	}
	public static void main(String[] args)throws Exception {
		/*
		int ans= divide(11,0); // iF it is throwing Exception then no line will be executed after that line.
		System.out.println("main");
		*/
		try {
		int ans= divide(9,0);
		System.out.println("Try block");
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Bye"); // in a try catch block after getting exception it will catch by catch block and after that other lines will be executed.
		
		
	}

}
