package ErrorDetection;

import java.util.Scanner;

public class CheckSumReceiver {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data :");
		String data=sc.nextLine();
		System.out.println("Enter the data Segment:");
		int segLen = sc.nextInt();
		
		receivercheckSum(data ,segLen);
	}

	private static void receivercheckSum(String dataBit, int segLen) {
	
		String []holder= new String[dataBit.length()/segLen];
		int tempSL=0;
		for( int i=0;i<holder.length;i++) {
			holder[i]=dataBit.substring(tempSL,tempSL+segLen);
			tempSL+=segLen;
		}
		
		for( int i=0 ;i<holder.length-1 ;i++) {
			String store = binaryAddition(holder[i] ,holder[i+1]);
			holder[i+1] = store;
		}
		
		System.out.println(holder[holder.length-1]);
	}

	private static String binaryAddition(String s1, String s2) {
		int carry=0;
		StringBuffer sum= new StringBuffer();
		for( int i=s1.length()-1 ;i>=0 ;i--) {
			int tempSum=(int)s1.charAt(i)+(int)s2.charAt(i)+carry-96;
			sum.append(tempSum%2);
			carry=tempSum/2;
		}
		sum.reverse();
		if(carry == 1) {
			for( int i=s1.length()-1 ;i>=0 ;i--) {
				int tempSum=(int)s1.charAt(i)+carry-48;
				sum.setCharAt(i, (char)((tempSum%2)+48));
				carry =tempSum/2;
			}
		}
		return sum.toString();
	}
}
