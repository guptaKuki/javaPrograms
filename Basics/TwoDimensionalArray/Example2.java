package TwoDimensionalArray;

public class Example2 {

	public static void main(String[] args) {
		int arr[][] = new int[4][5];
		for( int i=0;i<4;i++) {
			for( int j=0 ;j<5;j++) {
				arr[i][j] = (i+1)*(j+1);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}


	}

}
