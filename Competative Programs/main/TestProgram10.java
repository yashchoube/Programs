package main;

import java.util.Scanner;

public class TestProgram10 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		boolean v1=true;
		boolean v2=false;
		
//		System.out.println("OR "+ (v1||v2));
//		
//		System.out.println("AND "+ (v1&&v2));
//		
//		System.out.println("NOT "+ (!v2));
//		
		
		int x=10;
		double y =x;
		System.out.println("Wideing "+ x+"  " +y);
		
		int z=(int)y;
		System.out.println("Narrow "+z+" "+y);
		
		String strValue=sc.nextLine();
		char ch ='S';
		System.out.println("strValue "+strValue);
		int a=12;
		int b=16;
		int _1=2;
		System.out.println(a==b);
		int [] arr= {1,2,3,4,5,6};
		int n =sc.nextInt();
		int userArray[] = new int [n];
		
		
		for(int i=0;i<5;i++) {
			userArray[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.print(" "+userArray[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		/*System.out.println("Please Enter Some values");
		double userInput=sc.nextDouble();
		System.out.println("userInput "+userInput);
		System.out.println("Hello World");
		System.out.println("Happy "+_1);*/
	}
	
}
//	Ex: 
//		int a=10;
//		int -> Data Type
//		a => variable(Identifier)
//		= -> operator
//		10->constant/value
//		;->terminator

//int eno =111; valid
//int 9eno=999; invalid
//String _add="LPU"; valid
//float $aal=10; valid
//String em9no="Hello"; valid
//int _=2;


//int employee=111; valid
//
//int employee+number = 222; invalid
//
//int emp*numb=222; invalid
//
//String #str="Hello"; invalid
//
//String str_value="Hello"; valid

//int a b =10; invalid



