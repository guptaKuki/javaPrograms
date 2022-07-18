package Queue_Learn;

public class CircularQueueUsingArray {
	
		private int data[];
		private int front; //Index of element at the front of the queue.
		private int rear; //Index of element at the rear of the queue.
		private int size;
		
		public CircularQueueUsingArray() {
			data=new int[5];
			front=-1;
			rear=-1;
		}
		
		
		
		public int size() {
			return size;
		}
		
		public boolean isEmpty() {
			return size==0;
		}
		
		public int front() {
			if(front != -1)
				return data[front];
			else
				return -1;
		}
		
		public void enqueue(int ele) {
			if(rear == -1) {
				data[++rear]=ele;
				front++;
				size++;
			}else {
			
			rear= (rear+1)% data.length;
			data[rear]=ele;
			size++;
			}
		}
		
		public int dequeue() {
			if(size==0)
				return -1;
			
			int val=data[front];
			front=(front+1)%data.length;
			size--;
			return val;
		}
		

		public static void main(String[] args) {
			 int array[]= {10,20,30,40,50};
			 CircularQueueUsingArray cq= new CircularQueueUsingArray();
			 
			 for(int x:array)
				 cq.enqueue(x);
			 
			// cq.enqueue(1);
			 System.out.println(cq.size);
			 System.out.println("Dequeue: "+ cq.dequeue());
			 System.out.println("Dequeue: "+ cq.dequeue());
			 System.out.println("Dequeue: "+ cq.dequeue());
			 cq.enqueue(15);
			 cq.enqueue(25);
			 System.out.println("Dequeue: "+ cq.dequeue());
			 System.out.println("Dequeue: "+ cq.dequeue());
			 System.out.println("Dequeue: "+ cq.dequeue());
			 System.out.println(cq.size);
		}

	}


