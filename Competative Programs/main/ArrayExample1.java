package main;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		//int numArray [] = {1,2,3,4,5,6};   
		int size;
		size = s.nextInt();
		int userInput [] = new int [size];                       
		//userInput [] = 5
//																userInput[0]
//		for(int i =0;i<numArray.length;i++) {
//			System.out.println(numArray[i]);
//		}
		
		for(int i =0;i<size;i++) {
			userInput[i]=s.nextInt();
		}
		
		System.out.println("User Array");
		for(int i =0;i<size;i++) {
			System.out.println(userInput[i]);
		}
		
		System.out.println("Sorted Array");
		Arrays.sort(userInput);
		
		for(int i =0;i<size;i++) {
			System.out.println(userInput[i]);
		}
	}

}
