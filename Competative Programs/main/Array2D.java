package main;

import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) {
		int array[][] = new int [3][3];
		// row column
		
//		   0 1 2
//		0//1 2 3 (1=0,0) (2=0,1)
//		1//4 5 6 (5=1,1) (6=1,2)
//		2//7 8 9
		
//		2
//	4	5   6
//		8
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array[i][j]= sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j]+" ");
			}
			
		}
		
		
	}

}
