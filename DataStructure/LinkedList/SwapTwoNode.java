package LinkedList;

import java.util.Scanner;

public class SwapTwoNode {
	
	public static Node<Integer> swapNode(Node<Integer> head , int i ,int j){
		Node<Integer> cn1= head , cn2=head;
		Node<Integer> pn1=null , pn2= null;
		
		if(head == null)
			return null;
		if(i == j)
			return head;
		
		
		
		
//		if(i == 0 || j==0) {
//			if(i==0) {
//				cn1= head;
//				while(cn2 != null && j>0) {
//					pn2=cn2;
//					cn2=cn2.next;
//					j--;
//				}
//				pn1=cn1;
//				cn1=cn1.next;
//				
//				pn1.next=cn2;
//				pn2.next=cn1;
//				cn1.next=cn2.next;
//				cn2.next=pn2;
//				
//			}
//		}else {
			while(cn1 != null && i>0) {
				pn1= cn1;
				cn1= cn1.next;
				i--;
			}
			while(cn2 != null && j>0) {
				pn2=cn2;
				cn2=cn2.next;
				j--;
			}
			
//			pn1.next=cn2;
//			pn2.next=cn1;
//			cn1.next=cn2.next;
//			cn2.next=pn2;
			Node<Integer> temp;
			temp=cn1.next;
			cn1.next=cn2.next;
			cn2.next=temp;
		
		return head;
	}
	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		NodeCreation ll= new NodeCreation();
		Node<Integer> head=ll.createLinkedList();
		System.out.println("Enter the value of m");
		int i=s.nextInt();
		System.out.println("Enter the value of n");
		int j=s.nextInt();
		
		Node<Integer> result=swapNode(head,i,j);
		while(result != null) {
			System.out.print(result.data+" ");
			result=result.next;
		}
	}

}
