package main;

import java.util.Stack;

public class TestProgram6 {
	
	public static void main(String[] args) {
		System.out.println(validate());
	}

	private static boolean validate() {
		// TODO Auto-generated method stub
		
		String str="({()}";
		boolean balance=true;
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='(' || ch=='{') {
				st.push(ch);
				
			}
			
			while(!st.isEmpty()) {
				
				 if(ch==')') {
					if(st.pop()=='(' || st.isEmpty())
						balance= true;
					
				}
				
				else if(ch=='}') {
					if(st.pop()=='{' || !st.isEmpty())
						balance= true;
			}
				
			}
		}
				
		return false;

}
}
