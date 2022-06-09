package ErrorDetection;

import java.util.Scanner;

public class CRCSender {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the dataBit :");
		String dataBit=sc.nextLine();
		System.out.println("Enter the DivisorBit :");
		String divisorBit=sc.nextLine();
		sender(dataBit ,divisorBit);
	}

	private static void sender(String dataBit, String divisorBit) {
		int n=dataBit.length();
		int k=divisorBit.length();
		
		for(int i=1;i<k;i++)
			dataBit=dataBit.concat("0");
		
		String crc=mod2Div(dataBit,divisorBit);
		System.out.println("CRC bit :"+crc);
		System.out.println("message to be send :"+dataBit.substring(0, n).concat(crc));
	}

	private static String mod2Div(String dataBit, String divisorBit) {
		int n=dataBit.length();
		int k=divisorBit.length();
		
		String temp=dataBit.substring(0,k);
		int i=k;
		while(i<n) {
			if(temp.charAt(0)=='1')
				temp=xorstr(temp,divisorBit) + dataBit.charAt(i);
			else
				temp=temp.substring(1) +dataBit.charAt(i) ;
			i++;
			
		}
		
		if(temp.charAt(0)=='1')
			temp=xorstr(temp,divisorBit) ;
		else
			temp=temp.substring(1)  ;
	
		return temp;
	}

	private static String xorstr(String temp, String divisorBit) {
		String res="";
		for(int i=1;i<temp.length();i++) {
			if(temp.charAt(i) == divisorBit.charAt(i))
				res+="0";
			else
				res+="1";
		}
		return res;
	}

}

/*Steps:
 * 1. Take dividend bit and divisor bit as input
 * 2. divisor length is k and dividend length is n
 * 3. Do modulo-2 division on dividend and divisor
 * 4. Atlast when no bit is left is dividend stop
 * 
 */