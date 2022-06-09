package ErrorDetection;

import java.util.Scanner;

public class ParityCheckReceiver {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the message :");
		String data= sc.nextLine();
		System.out.println("In which way sender send you message : 1. EvenParity  2. OddParity");
		int choice = sc.nextInt();
		if( choice == 1)
			evenParity(data);
		else
			oddParity(data);
		
	}

	private static void oddParity(String data) {
		int count=0;
		int l=data.length();
		for( int i=0;i<data.length()-1;i++) {
			if(data.charAt(i) == '1')
				count++;
		}
		if(count%2 != 0 && data.charAt(l-1)=='0' || count%2 == 0 && data.charAt(l-1)=='1')
			System.out.println("Message Accepted");
		else
			System.out.println("Resend Message");
	}

	private static void evenParity(String data) {
		int l=data.length();
		int count=0;
		for( int i=0;i<data.length()-1;i++) {
			if(data.charAt(i) == '1')
				count++;
		}
		if(count%2 == 0  && data.charAt(l-1) == '0' || count%2 != 0 && data.charAt(l-1)=='1')
			System.out.println("Message Accepted");
		else
			System.out.println("Resend Message");
	}

}
