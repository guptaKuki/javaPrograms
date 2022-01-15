package TwoDimensionalArray;

public class Example {

	public static void main(String[] args) {
		int arr[][] = new int[4][5];
		for( int i=0;i<4;i++) {
			arr[i][0]=2;
		}
		System.out.println(arr[3][0]);
	}

}
