package LinkedList;
import java.util.Scanner;

public class Print_ithNode {

	public static int ithNode(int x,Node<Integer>head) {
		Node<Integer> temp=head;
		int index=0;
		while(temp != null) {
			if(index == x)
				return temp.data;
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		LengthofLinkedListed ll= new LengthofLinkedListed();
		
		Node<Integer> head=ll.createLinkedList();
		System.out.println("Enter the index:");
		int x= s.nextInt();
		int res=ithNode(x,head);
		System.out.println(res);

	}

}
