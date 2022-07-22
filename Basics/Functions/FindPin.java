package Functions;

import java.util.Scanner;

public class FindPin {
	
	public static int pinFormation(int input1 , int input2 , int input3 , int input4) {
		int pin=smallest(input1)*largest(input2)*largest(input3)+input4;
		return pin;
	}

	private static int largest(int input) {
		int max=0;
		while(input>0) {
			int val=input%10;
			if(val>= max)
				max=val;
			input=input/10;
		}
		return max;
	}

	private static int smallest(int input) {
		int min=9;
		while(input>0) {
			int val=input%10;
			if(val<= min)
				min=val;
			input=input/10;
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the first input: ");
		int input1=sc.nextInt();
		System.out.println("Enter the second input: ");
		int input2=sc.nextInt();
		System.out.println("Enter the third input: ");
		int input3=sc.nextInt();
		System.out.println("Enter the fourth input: ");
		int input4=sc.nextInt();
		
		int pin=pinFormation(input1,input2,input3,input4);
		System.out.println("Pin :"+pin);
	}

}
