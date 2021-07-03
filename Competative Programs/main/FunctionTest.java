package main;

import java.util.Arrays;
import java.util.Scanner;

// To sum of two numbers.
// Now we will make the function which will have the logic of sum.
// After the main method i am defining a function called as sum\
// till now every thing is clear?
// Now lets see parameterized function. we will take the input from main and then pass into our sum function.

public class FunctionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number");
		int num2 = sc.nextInt();
		
		int calculatedSum = sum(num1,num2); 
		System.out.println(calculatedSum);
		multiply(calculatedSum);
		// now this sum(); function is returning value and the value is stored in calculatedSum
		//and then we display this calculatedSum
		// now you can see the sum function has no arguments.
		// 
		
	}
	// private static void => Private is access modifier only the class itself use the function .
	//static ==> will learn this after voice issue resolved
	// void ==> here we are not returning any thing
// now we will return the numbers.
	// As we know that sum of two integer is integer only so the function will return integer only. 
	private static int sum(int n1, int n2) {
		
		int add = n1+n2;
		// removing the print statement
		return add;
		// the type of sum is integer now we are returning sum
	//	System.out.println("Sum : "+sum);
		
	}
	
	private static void multiply(int number) {
		System.out.println(number*2);

	}


}
