package main;

import java.util.Scanner;
import java.util.Stack;

public class BracesMatching {

	static Stack<Character>stack = new Stack<>();
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
			
		System.out.println(IsBracesMatching());
	}
	public static boolean IsBracesMatching(){
		
		String parenthesisInput = scanner.next();
			
			for (int i = 0; i < parenthesisInput.length(); i++) {
				char ch = parenthesisInput.charAt(i);
				
				switch(ch) {
					case '(':stack.push(ch);break;
					case '{':stack.push(ch);break;
					case '[':stack.push(ch);break;
					case ')':if((!stack.isEmpty()) && stack.peek().equals('('))
								stack.pop();
							 else {
								 System.out.println(stack);
								return false;}
					
					break;
					
					case '}':if((!stack.isEmpty())&& stack.peek().equals('{'))
						stack.pop();
					 else 
						return false;break;
					case ']':if((!stack.isEmpty())&& stack.peek().equals('['))
						stack.pop();
					 else 
						return false;break;
					
				}
				}
			if(stack.isEmpty()) {
				return true;
			}
			else {
				return false;
			}
						
	}
}