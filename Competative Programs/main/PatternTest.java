package main;

import java.util.Scanner;

public class PatternTest {
	
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(++count+" ");
			}
			System.out.println();
		}
	}

}
