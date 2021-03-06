package LinkedList;
import java.util.Scanner;


class Node<T>{
	T data;
	Node<T> next;
	
	Node(T data){
		this.data=data;
	}
}

public class LinkedListImplement {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1= new Node<>(10);
		Node<Integer> n2= new Node<>(20);
		Node<Integer> n3= new Node<>(30);
		Node<Integer> n4= new Node<>(40);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=null;
		return n1;
	}
	
	public static void printLinkedList(Node<Integer> head) {
		System.out.print(head.data+"->");
		System.out.print(head.next.data+"->");
		System.out.print(head.next.next.data+"->");
		System.out.print(head.next.next.next.data);
		System.out.println();
	}
	
	public static void print(Node<Integer>  head) {
		Node<Integer> temp =head;
		while(temp != null) {
			//System.out.print(temp.data+" ["+temp+"]->");
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		
		Node<Integer> n= new Node<>(10);
		System.out.println(n);
		System.out.println(n.data);
		System.out.println(n.next);
		
		Node<Integer> head=createLinkedList();
		printLinkedList(head);
		print(head);
	}

}
