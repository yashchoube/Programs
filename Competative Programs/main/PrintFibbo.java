package main;

import java.util.Scanner;

public class PrintFibbo {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	for(int i =1; i<=20;i++) {
		fibbo(i);
		System.out.println();
	}
}

private static void fibbo(int i) {
	// TODO Auto-generated method stub
	int a =0;
	int b=1;
	
	if(i==1) {
		System.out.print(a+" "+b);
	}
	
	else {
		
	for(int j=0;j<=i/2;j++) {
		System.out.print(" "+a+" "+b+" ");
		a=a+b;
		b=a+b;
		
	}
	
System.out.println();
}
}
}



// from 1 to 20