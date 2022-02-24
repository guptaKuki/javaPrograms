package ObjectOrientedProgramming;

class Add{
	Add(Fraction fac1,Fraction fac2){}
	
	public Fraction  add(Fraction fac1, Fraction fac2) {  
		// add method having two object of fraction class as argument and return type is also a object of fraction class
		fac1.numerator=fac1.numerator *fac2.denominator+ fac2.numerator*fac1.denominator;
		
		fac1.denominator= fac1.denominator* fac2.denominator;
		return fac1;
	}
	
}
public class AddFraction {

	public static void main(String[] args) {
		Fraction fac1=new Fraction(2,3);
		Fraction fac2= new Fraction(1,2);
		
		Add a1= new Add(fac1,fac2); 
		Fraction f3= a1.add(fac1, fac2);
		 f3.simplfy();
		 f3.print();
		 

	}

}
