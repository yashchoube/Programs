package main;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		String str = "abcabc";
		if(str.isEmpty()) {
			System.out.println("Enter valid string");
		}
		else {
		System.out.println(isUnique(str));
		}
		
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
		boolean result=true;
		Set <Character> unique = new HashSet<>(); 
		for(int i=0;i<str.length();i++) {
			if(unique.contains(str.charAt(i))) {
				result= false;
			}
			else {
				unique.add(str.charAt(i));
			}
			
		}
		return result;
	}
}
