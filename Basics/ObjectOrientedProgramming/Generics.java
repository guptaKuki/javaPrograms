package ObjectOrientedProgramming;

class Pair<T>{
	/* If we want that first is of type int and second is type of String we can do this using generics by giving two parameter inside < T,V>
	 like this and  now we have to change and pass the two types of data we want 
	 */
	 //class Pair<T,V>{
	private T first;
	private T second;
	//private V second;
	
	Pair(T first ,T second){
		this.first=first;
		this.second=second;
	}
	
	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void setFirst(T first) {
		this.first=first;
	}
	
	public void setSecond(T second) {
		this.second=second;
	}
}

public class Generics {

	public static void main(String[] args) {
		
		Pair<String> p1= new Pair<String>("Kuki","Maggi");
		p1.setFirst("Shivam");
		System.out.println(p1.getFirst()+"  "+p1.getSecond());
		
		Pair<Integer> p2= new Pair<Integer>(10,5);  // we cannot use primitive data type. so, we can use Integer class for int type Boolean for boolean  and so on.
		
		Pair<Character> p3 = new Pair<>('a','c');
		// Pair <String, Integer> p4= new Pair<String,Integer>("Kuki",10);
		int a=10;
		int b=12;
		int c=23;
		
		
		
	}

}
