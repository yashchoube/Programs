package main;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		long count=0;
		Scanner scanner = new Scanner(System.in);
		
		long a= scanner.nextLong();
		long b= scanner.nextLong();
		long minimum= Math.max(a, b);
		//System.out.println(gcd(a,b));
		for(long i =1; i<=gcd(a,b); i++) {
			if((gcd(a,b)%i==0)){
				count++;
			}
		}
		System.out.println(count);
	}
	

	 static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		if(b==0)
			return a;
		else 
			 return gcd(b,a%b);
		
	}
	
	
}
