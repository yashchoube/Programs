package main;

import java.util.Scanner;

public class AgainFib {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(); 
		
//		int a=0;
//		int b=1;
//		
//		System.out.print(a+" "+b);
//		for(int i = 0;i<number/2-1;i++) {
//			a=a+b;
//			b=a+b;
//			System.out.print(" "+a+" "+b);
//		}
		
		System.out.println(fib(number));
	}

//	 static int recurssion(int number) {
//		// TODO Auto-generated method stub
//		 if (number<=1)
//			 return number;
////		 if(number==1)
////			 return 1;
//		 else
//			 return recurssion(number-1)+recurssion(number-2);
//		
//	}
	 
	 
	     static int fib(int n)
	     {
	     if (n <= 1)
	        return n;
	     return fib(n-1) + fib(n-2);
	     }
	       
	     
	 

}
