package ObjectOrientedProgramming;

class Fraction{
//	private int numerator;
//	private int denominator;
	
	public int numerator;
	public int denominator;
	
	Fraction(int numerator , int denominator){
		this.numerator=numerator;
		if(denominator<=0) {
			System.out.println("invalid Denominator");
			this.denominator=1;
		}else
			this.denominator=denominator;
		simplfy();
	}
	
	public void setNumerator(int n) {
		if(n<0)
			System.out.println("invalid Numerator");
		else
			this.numerator=n;
	}
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int n) {
		if(n<=0)
			System.out.println("invalid Denominator");
		else
			this.denominator=n;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public void simplfy() {
		int smallest= Math.min(numerator, denominator);
		int gcd=1;
		for(int i=2;i<=smallest;i++) {
			if(numerator % i == 0 && denominator % i ==0)
				gcd=i;
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	
	public void print() {
		System.out.println(numerator+"/"+denominator);
	}
	
	public void increment() {
		numerator=numerator+denominator;
	}
}

public class FractionUse {

	public static void main(String[] args){
		
		Fraction f1= new Fraction(4,6);
		f1.print();
		f1.increment();
		f1.print();
		Fraction f2= new Fraction(5,0);
		f2.print();
		

	}

}
