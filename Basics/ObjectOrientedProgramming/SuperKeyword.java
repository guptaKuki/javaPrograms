package ObjectOrientedProgramming;

class Food{
	String name;
	int price; // Super class variable
	
	public void print() { //Super class method
		System.out.println("Name :"+name+" "+"Price :"+price);
	}
}

class Momos extends Food{
	String momoType;
	int price;
	
	public void print() {
		super.print();
		System.out.println("MomoType :"+momoType);
		System.out.println("price of food  "+super.price);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Food f= new Food();
		
		f.name="Eggroll";
		f.price=35;
		
		f.print();
		
		Momos m= new Momos();
		m.name="momos";
		m.momoType="Chicken momos";
		m.price=50;
		
		m.print();
	}

}
