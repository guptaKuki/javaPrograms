package Learn_HashMap;

import java.util.HashMap;

public class HashmapFunctions {

	public static void main(String[] args) {

		HashMap<String ,Integer> map= new HashMap<>();
		
		map.put("abc",4);
		map.put("def",5);
		if(map.containsKey("abc"))
			System.out.println("map has abc");
		if(map.containsKey("abc1"))
			System.out.println("map has abc1");
		
		if(map.containsKey("def")) {
		 int var = map.get("def");
		 System.out.println(var);
		}
		
		map.remove("abc1");
		System.out.println(map.size());
		map.remove("abc");
		System.out.println(map.size());
	}

}
