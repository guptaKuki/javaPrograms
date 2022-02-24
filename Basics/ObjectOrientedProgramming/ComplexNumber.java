package ObjectOrientedProgramming;

class Complex{
	int real;
	int imaginary;
	
	Complex(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void print() {
		System.out.println(real+" i"+imaginary);
	}
	
}

class Operation{
	Operation(){}
	
	public void add(Complex c1, Complex c2) {
		Complex c3= new Complex( 0 ,0);
		c3.real= c1.real+c2.real;
		c3.imaginary= c1.imaginary+c2.imaginary;
		
		System.out.println("Addition of two complex number: "+c3.real+" + ("+(c3.imaginary)+")i");
	}
	
	public void multiply(Complex c1, Complex c2) {
		Complex c4= new Complex(0,0);
		c4.real= (c1.real*c2.real) - (c1.imaginary * c2.imaginary);
		c4.imaginary= (c1.real*c2.imaginary) + (c1.imaginary * c2.real);
	
		System.out.println("Multiplication of two complex number: "+c4.real+" + ("+(c4.imaginary)+")i");
	}
	
	
}

public class ComplexNumber {

	public static void main(String[] args) {
		Complex c1= new Complex(4,5);
		Complex c2 =new Complex(3,-6);
		
		Operation o1= new Operation();
		o1.add(c1, c2);
		o1.multiply(c1, c2);
		
	}

}
