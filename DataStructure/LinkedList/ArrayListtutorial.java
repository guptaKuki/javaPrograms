package LinkedList;
import java.util.ArrayList;

public class ArrayListtutorial {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(1, 5);
		
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		System.out.println(arr);
		
		//for each loop
		
		for( int i: arr) { // i holds the value of arraylist elements
			System.out.print(i+" ");
		}
	}

}
