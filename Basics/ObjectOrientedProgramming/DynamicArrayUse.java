package ObjectOrientedProgramming;


class DynamicArray{
	private int data[];
	private int nextElementIndex;
	
	DynamicArray(){
		data= new int[5];
		nextElementIndex=0;
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		if(nextElementIndex == 0)
			return true;
		else 
			return false;
	}
	
	public int get(int i) {
		if(i>= nextElementIndex)
			return -1;
		
		return data[i];
	}
	
	public void set(int i, int n) {
		if(i>= nextElementIndex)
			return ;
		data[i]=n;
	}
	public void add(int n) {
		if(nextElementIndex == data.length) 
			doubleCapacity();
		
		data[nextElementIndex]=n;
		nextElementIndex++;
	}
	
	private void doubleCapacity() {
		int temp[]= data;
		data= new int[2*temp.length];
		
		for( int i=0;i<temp.length;i++) 
			data[i]=temp[i];
	}
	
	public int removeLast() {
		if( nextElementIndex == 0)
			return -1;
		int last= data[nextElementIndex-1];
		nextElementIndex--;
		return last;
	}
	
}

public class DynamicArrayUse {

	public static void main(String[] args) {
		
		DynamicArray d= new DynamicArray();
		
		for( int i =1; i<100; i++) {
			d.add(100+i);
		}
		
		System.out.println(d.size());
		System.out.println(d.get(2));
		
		d.set(3,170);
		System.out.println(d.get(3));
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("size -"+d.size());
			
		}

	}

}
