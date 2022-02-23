package ObjectOrientedProgramming;

class Office {
	private int emp_id;
	String emp_name;
	
	public void setId(int n) {
		if(n>0)
			emp_id=n;
		else
			System.out.println("Invalid Id number.");
	}
	public int getId() {
		return emp_id;
	}
	
	public  void setName(String str) {
		emp_name=str;
	}
	
}

public class GetterandSetter {
	
	public static void main(String[] args) {
	
		Office o=new Office();
		o.setId(150);
		o.setName("Rupesh");
		System.out.print(o.emp_name+" ");
		System.out.println(o.getId());

	}

}
