package ObjectOrientedProgramming;

import java.util.Scanner;

/*Inheritance is a mechanism by which one class can extend 
functionality from an existing class. */

//(Parent Class) Base class
 class Vehicle{
	String color;
	int maxSpeed;
	
	public  void print(){
		System.out.println("Color "+color+" maxSpeed "+maxSpeed);
	}
}

//(Child Class) Sub Class
class FourwWheeler extends Vehicle{
	int noOfDoor;
	@Override
	public void print() { // 
		System.out.println("Color "+color+" maxSpeed "+maxSpeed+" No of Doors "+noOfDoor);
	}
}

//Child Class
class Bicycle extends Vehicle{
	String company;
}
public class Inheritance {

	public static void main(String[] args) {
	
		Vehicle v= new Vehicle();
		v.color="Black";
		v.maxSpeed=80;
		v.print();
		
		FourwWheeler c= new FourwWheeler();
		c.color="Silver";
		c.maxSpeed=150;
		c.noOfDoor=4;
		
		c.print();
		
		Bicycle bc= new Bicycle();
		bc.color="Red";
		bc.company="BBT";
		bc.print();
	}

}
