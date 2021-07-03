package main;

import java.util.Scanner;

public class BasicProg {
	
	public static void main(String[] args) {
		int i=0 ;
		int f =0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter two integer value");
		
		i = sc.nextInt();
		f = sc.nextInt();
		int sum =i+f;
		System.out.println("Sum "+sum+" of two numbers");
		
	}
	
}
