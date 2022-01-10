package Functions;

public class FunctionOverloading {
	
	public static int sum(int a, int b) {
		int result=a+b;
		return result;
	}
	
	public static double sum(double a, double b) {
		double result=a+b;
		return result;
	}
	public static int sum(int a) {
		return a+1;
	}
	
	public static void main(String[] args) {
	 int a=10;
	 int b=5;
	  System.out.println(sum(a,b)); //passing two parameter
	  System.out.println(sum(a));  //passing one parameter
	  System.out.println(sum(10.2,5.6));
	}

}
// depend on the parameters function call works.