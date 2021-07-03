package main;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String s ="madam";
		System.out.println(reverseString(s));
	}

	private static boolean reverseString(String s) {
		// TODO Auto-generated method stub
		if(s.length()<=1) {
			return true;
		}
		else {
			System.out.println(s.substring(1, s.length()-1));
			return ((s.charAt(0)==s.charAt(s.length()-1)) && reverseString(s.substring(1, s.length()-1)));
		
		}
		
	}
	
}
