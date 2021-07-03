package main;

import java.util.Scanner;

// Quadrant
// Else If
public class ConditionTest2 {
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = s.nextInt();
		System.out.println("Enter a number");
		int y = s.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1st Quadrant");
		}
		
		else if (x<0 && y>0) {
			System.out.println("2nd Quadrant");
		}
		
		else if(x<0 && y<0) {
			System.out.println("3rd Quadrant");
		}
		
		else if(x==0 && y==0) {
			System.out.println("Origin");
		}
		
		else {
			System.out.println("4th Quadrant");
		}
	}

}
