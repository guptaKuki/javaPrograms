package ObjectOrientedProgramming;
 
class Group<T,V>{
	private T one;
	private V two;
	
	Group(T one ,V two){
		this.one= one;
		this.two=two;
	}
	
	public T getOne() {
		return one;
	}
	
	public V getTwo() {
		return two;
	}
	
	public void setOne(T one) {
		this.one=one;
	}
	
	public void setTwo(V two) {
		this.two=two;
	}
}

public class MoreGenerics {

	public static void main(String[] args) {
		
		int a=10; 
		int b=12;
		int c=23;
		
		Group<Integer,Integer> internalGroup= new Group<>(a,b);
		Group<Group<Integer,Integer>,Integer> g= new Group<>(internalGroup,c); 
		
		System.out.println(g.getOne().getOne()); // If we want access first element of internal group;
		System.out.println(g.getTwo());

	}

}
