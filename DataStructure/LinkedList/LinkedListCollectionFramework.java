package LinkedList;

import java.util.LinkedList;

public class LinkedListCollectionFramework {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.addFirst(80);
		list.addLast(100);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
	}

}
