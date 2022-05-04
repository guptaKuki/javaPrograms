package Stack;

import java.util.*;

public class BalancedBrackets {
	
	public static boolean checkBalanced(String bracket) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<bracket.length();i++) {
			
			if(bracket.charAt(i) == '[' || bracket.charAt(i)=='{' || bracket.charAt(i)=='(') {
				stack.push(bracket.charAt(i));
				
			}else if (bracket.charAt(i) == ']' || bracket.charAt(i)=='}' || bracket.charAt(i)==')') {
				
				if(stack.isEmpty())
					return false;
				
					char ch=stack.pop();
					if(bracket.charAt(i)==')' && ch=='(')
						continue;
					else if(bracket.charAt(i)=='}' && ch=='{')
						continue;
					else if(bracket.charAt(i)==']' && ch=='[')
						continue;
					else
						return false;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter te string of brackets:");
		String bracket=sc.nextLine();
		boolean check=checkBalanced(bracket);
		System.out.println(check);
		
		

	}

}
