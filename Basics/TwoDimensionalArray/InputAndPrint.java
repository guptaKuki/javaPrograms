package TwoDimensionalArray;
import java.util.Scanner;

public class InputAndPrint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows=s.nextInt();
		System.out.println("Enter the number of columns");
		int cols=s.nextInt();
		
		int array[][]=new int[rows][cols];
		// to taking input
		for( int i=0 ;i<rows;i++) {
			for( int j=0;j<cols;j++) {
				System.out.println("Enter the  " + i+j+" "+"value");
				array[i][j]=s.nextInt();
			}
		}
		
		//To Print
		for( int i=0 ;i<rows;i++) {
			for( int j=0;j<cols;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
