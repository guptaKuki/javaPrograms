package ErrorDetection;

import java.util.Scanner;

public class CRC_Receiver {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the DataBit :");
		String dataBit=sc.nextLine();
		System.out.println("Enter the DivisorBit :");
		String divisorBit=sc.nextLine();
		receiver(dataBit, divisorBit);
	}

	private static void receiver(String dataBit, String divisorBit) {
		
		int n=dataBit.length();
		int k=divisorBit.length();
		
		String remainder=mod2Div(dataBit ,divisorBit);
	
		for( int i=0;i<remainder.length();i++) {
			if(remainder.charAt(i) != '0') {
				System.out.println("Resend Message");
				return;
			}
		}
		System.out.println("Message Accepted");
	}

	private static String mod2Div(String dataBit, String divisorBit) {
		int n=dataBit.length();
		int k=divisorBit.length();
		
		String temp=dataBit.substring(0,k);
		int i=k;
		while(i<n) {
			if(temp.charAt(0)=='1')
				temp = xorstr(temp,divisorBit) + dataBit.charAt(i); 
			else
				temp=temp.substring(1) + dataBit.charAt(i);
			i++;
		}
		if(temp.charAt(0)=='1')
			temp = xorstr(temp,divisorBit); 
		else
			temp=temp.substring(1);
		
		return temp;
	}

	private static String xorstr(String temp, String divisorBit) {
		String div="";
		for( int i=1;i<temp.length();i++) {
			if(temp.charAt(i)==divisorBit.charAt(i))
				div+='0';
			else
				div+='1';
		}
		return div ;
	}

}
