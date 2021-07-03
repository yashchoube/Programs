package main;

import java.util.Scanner;

public class ConditionTest4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("please enter a/b/c/d");
		char ch = s.next().charAt(0);
		
		switch(ch) {
			case 'a': System.out.println(ch);break;
			case 'b': System.out.println(ch);break;
			case 'c': System.out.println(ch);break;
			case 'd': System.out.println(ch);break;
			default : System.out.println("please enter a/b/c/d");
		}
		
	}
}
