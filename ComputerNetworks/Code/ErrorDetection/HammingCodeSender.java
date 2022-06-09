package ErrorDetection;

import java.util.Scanner;

public class HammingCodeSender {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the data :");
		String data= sc.nextLine();
		int m= data.length();
		int r=1;
		
		while(Math.pow(2, r) <(m+r+1)) {
			// r is number of redundant bit.
			r++;
		}
		
		int arr[]=generateHammingCode(data,m,r);
		
		for(int num:arr)
			System.out.print(num);
	}

	private static int[] generateHammingCode(String data, int m, int r) {
		int []arr= new  int[m+r+1];
		int j=0;
		
		for(int i=1;i<arr.length;i++){
            if(Math.ceil(Math.log(i)/Math.log(2))-Math.floor(Math.log(i)/Math.log(2))==0){
                arr[i] = 0;
            }
            else{
                arr[i] = (int)(data.charAt(j)-'0');
                j++;
            }
        }
		for(int num:arr)
			System.out.print(num);
		System.out.println();
		
		calculation(arr,m,r);
		return arr;
	}

	private static void calculation(int[] arr, int m, int r) {
		
		for(int i=0;i<r;i++) {
			int x=(int)Math.pow(2, i);
			for(int j=1;j<arr.length;j++) {
				if(((j>>1)&1)==1) {
					if(x != j)
						arr[x]=arr[x] ^ arr[j];
				}
			}
		}
	}

}

/*Steps:
 * 1. Write the bit positions starting from 1 in binary form (1, 10, 11, 100, etc).
 * 2. All the bit positions that are a power of 2 are marked as parity bits (1, 2, 4, 8, etc).
 * 3. All the other bit positions are marked as data bits.
 * 4. Each data bit is included in a unique set of parity bits, as determined its bit position in binary form.
 *   a. Parity bit 1 covers all the bits positions whose binary representation includes a 1 in the least significant
 *   position (1, 3, 5, 7, 9, 11, etc).
 *   b. Parity bit 2 covers all the bits positions whose binary representation includes a 1 in the second position from
 *   the least significant bit (2, 3, 6, 7, 10, 11, etc).
 *   c. Parity bit 4 covers all the bits positions whose binary representation includes a 1 in the third position from
 *   the least significant bit (4–7, 12–15, 20–23, etc).
 *   d. Parity bit 8 covers all the bits positions whose binary representation includes a 1 in the fourth position from
 *   the least significant bit bits (8–15, 24–31, 40–47, etc).
 *   e. In general, each parity bit covers all bits where the bitwise AND of the parity position and the bit position is
 *   non-zero.
 * 5. Since we check for even parity set a parity bit to 1 if the total number of ones in the positions it checks is
 *    odd.
 * 6. Set a parity bit to 0 if the total number of ones in the positions it checks is even.
 */