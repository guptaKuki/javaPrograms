package ErrorDetection;

import java.util.Scanner;

public class CheckSumSender {

	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the data :");
		String data=sc.nextLine();
		System.out.println("Enter the data Segment:");
		int segLen = sc.nextInt();
		
		if(!isPowerofTwo(segLen)) { 
			System.out.println("Segment lenth must be power of 2");
			return;
		}
		
		if(data.length() % segLen !=0) {
			int count = segLen - (data.length() % segLen);
			while(count>0) {
				data='0'+data;
				count--;
			}
		}
		senderSum(data ,segLen);
		}

	private static void senderSum(String dataBit, int segLen) {
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
		
		String checkSum =holder[holder.length-1];
		checkSum = complement(checkSum);
		dataBit= dataBit.concat(checkSum);
		System.out.println("DataBit to be send :"+dataBit);
	}

	private static String complement(String checkSum) {
		
		StringBuffer tempstr= new StringBuffer(checkSum);
		for( int i=0 ;i<tempstr.length();i++) {
			tempstr.setCharAt(i, tempstr.charAt(i)=='0' ? '1' :'0');
		}
		return tempstr.toString();
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

	

	private static boolean isPowerofTwo(int segLen) {
		int i=0;
		while(i<=segLen/2) {
			if(Math.pow(2, i)== segLen)
				return true;
			i++;
		}
		return false;
	}
	
}
 
/*Steps:
1. Take Data Bit and segment length as input in main
2. Check if segment length is power of 2=> if not terminate the program with proper message
3. Convert Decimal to Binary and append zeroes.
4. Make holder String arrays to hold all data bit segments
5. Add all the segments one by one and store
6. complement the last segment(sum) of the holder array
7. Append the sum to the data bit
8. send to the receiver side
*/