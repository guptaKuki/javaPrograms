package Learn_HashMap;

import java.util.HashSet;
import java.util.Iterator;
public class HashSet_learn {

	public static void main(String  []args) {
		
		//Creation
		HashSet<Integer> set= new HashSet<>();
		
		//To Add
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set.size());
		
		//print
		System.out.println(set);
		
		//Search -contains
		if(set.contains(1))
			System.out.println("set contain 1");
		if(! set.contains(6))
			System.out.println("doesn't contain 6");
		
		//Delete
		set.remove(1);
		if(!set.contains(1))
			System.out.println("set doesn't contain 1");
	
		
		//Iterator
		Iterator it= set.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}
