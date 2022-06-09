package ErrorDetection;

import java.util.Scanner;

public class ParityCheckSender {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the data :");
		int data=sc.nextInt();
		String dataBit = decTobin(data);
		System.out.println("Enter the choice : 1.Even Parity  2.Odd Parity");
		int choice =sc.nextInt();
		if(choice == 1)
			evenParity(dataBit);
		else
			oddParity(dataBit);
	}

	private static void evenParity(String dataBit) {
		Scanner s= new Scanner(System.in);
		int count =0;
		for(int i=0 ;i<dataBit.length() ;i++) {
			if(dataBit.charAt(i) == '1')
				count++;
		}
		if(count % 2 == 0)
			dataBit+='0';
		else
			dataBit+='1';
		System.out.println("Message to be send before error :"+dataBit);
		
		System.out.println("Do you want to generate error : 1.yes 2. No" );
		int errorchoice =s.nextInt();
		if( errorchoice == 1) {
			generateError(dataBit);
		}
		
	}

	private static void generateError(String dataBit) {
		Scanner s= new Scanner(System.in);
		StringBuffer wrongData= new StringBuffer(dataBit);
		System.out.println("Enter the position you want to generate error :");
		int pos=s.nextInt();
		if(pos > dataBit.length()  || pos < 0) {
			System.out.println("enter the valid position");
			return;
		}else {
			if(wrongData.charAt(pos) == '0')
				wrongData.setCharAt(pos,'1');
			else
				wrongData.setCharAt(pos,'0');	
			}
		
		System.out.println("Message send after error :"+wrongData);
	}

	private static void oddParity(String dataBit) {
		Scanner s= new Scanner(System.in);
		int count =0;
		for(int i=0 ;i<dataBit.length() ;i++) {
			if(dataBit.charAt(i) == '1')
				count++;
		}
		if(count % 2 != 0)
			dataBit+='0';
		else
			dataBit+='1';
		System.out.println("Message to be send :"+dataBit);
	}

	private static String decTobin(int data) {
		String dataBit="";
		while(data>0) {
			dataBit= (data%2)+dataBit;
			data=data/2;
		}
		return dataBit;
	}

}

/*Steps: 
1. Take input 
2. Convert into Binary
3. Check parity
4. 
*/