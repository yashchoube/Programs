package main;

import java.util.Scanner;

public class BasicFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1=sc.nextInt();
		printNumber(a1);
//		int b1= sc.nextInt();
//		int sum=sumTwoNum(a1,b1);
//		int squareOfNum=Square(sum);
//		if(squareOfNum<10) {
//			System.out.println("Square of num is less than 10");
//		}
//		
//		else {
//			System.out.println("Square of num is greater than 10");
//		}
//	}
//
//	public static int Square(int sum) {
//		// TODO Auto-generated method stub
//		System.out.println("Square of number");
//		System.out.println(sum*sum);
//		return (sum*sum);
//	}
//
//	public static int sumTwoNum(int a1, int b1) {
//		// TODO Auto-generated method stub
//		return(a1+b1);
//	}
//
		}

	public static void printNumber(int a) {
		// TODO Auto-generated method stub
		
//		for(int i=1;i<a;i++) {
//			if(i%2==0) {
//				continue;
//			}
//			else {
//				System.out.println(i);
//			}
//		}
		try {
		System.out.println(a/0);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		
	}
//		switch(a) {
//		case 1: System.out.println("1");break;
//		case 2: System.out.println("2");break;
//		default: System.out.println("other Number");
		
		//}
	
	}
