package ObjectOrientedProgramming;

public class FinallyKeyword {

	static void method() throws Exception {
		try {
			throw new Exception();
		}finally{
			//Java finally block is a block used to execute important code such as closing the connection.
			System.out.println("hello");
		}
	}
	public static void main(String[] args) {
		

		try {                 
			//For each try block there can be zero or more catch blocks, but only one finally block
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("End of Program");
		}
	}

}
