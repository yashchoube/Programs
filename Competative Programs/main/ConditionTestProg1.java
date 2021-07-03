package main;

import java.util.Scanner;

public class ConditionTestProg1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any number");
		int number = s.nextInt();
		
		if(number>=0) {
			System.out.println(number+" Positive");
		}
		
		else {
			System.out.println(number+" Negative");
		}
	}

}
