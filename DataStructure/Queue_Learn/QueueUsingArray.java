package Queue_Learn;

class QueueUse{
	
	private int data[];
	private int front;  // index of front element of queue
	private int rear;  // index of last element of queue
	private int size;
	
	QueueUse(){
		data= new int[5];
		front=-1;
		rear=-1;
	}
	
	QueueUse(int capacity) {
		data=new int[capacity];
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
		if(front==-1)
			return -1;
		return data[front];
	}
	
	public void enqueue(int element) {
		if(size == data.length) {
			System.out.println("queue is full");
			return;
		}

		if(front ==-1) {
			front=0;
		}
		
		rear++;
		if(rear==data.length)
			rear=0;
		//rear=(rear+1)%data.lerngth;
		
		data[rear]=element;
		size++;
	}
	
	public int dequeue() {
		if(size==0) {
			front=-1;
			rear=-1;
			return -1;
		}
		
			int val=data[front];
			front++;
			if(front == data.length)
				front=0;
			//front=(front+1)%data.length;
			
			size--;
			return val;
		
	}
}

public class QueueUsingArray {

	public static void main(String[] args) {
		
		QueueUse que = new QueueUse();
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		System.out.println("Size :"+ que.size());
		System.out.println("delete first element: "+que.dequeue());
		System.out.println("uodated front :"+que.front());
		
	}

}
