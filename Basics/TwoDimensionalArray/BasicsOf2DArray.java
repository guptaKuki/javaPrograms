package TwoDimensionalArray;

public class BasicsOf2DArray {

	public static void main(String[] args) {
		int arr2d[][] = new int[3][4]; // to initialize 2-D array
		
		System.out.println(arr2d[1][2]);
		
		arr2d[2][1]=15;
		System.out.println(arr2d[2][1]);
		System.out.println(arr2d);  // it contain address ([[ shows it is 2-D array)
		System.out.println(arr2d[0]);
		
		System.out.println(arr2d.length);  //to calculate length of rows
		
		System.out.println(arr2d[0].length);  //To calculate the length of columns
	}

}