package main;

import java.util.*;



// 1 byte = 8 bit 
//128 64 32 16 8 4 2 1 
//Data Type	Size	Description
//byte	1 byte	Stores whole numbers from -128 to 127
//short	2 bytes	Stores whole numbers from -32,768 to 32,767
//int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//boolean	1 bit	Stores true or false values
//char	2 bytes	Stores a single character/letter or ASCII values
//byte -> short -> char -> int -> long -> float -> double
// byte and bit.
//new 

// Examples of DataTypes
public class DataTypesExamples {
	
	

	public static void main(String[] args) {
		
		String str1 = "hi";
		String str2 = "hello";
		
		
		
		String strArray [] = {str1,str2};
		
		
		//0  , 1 , 2

//		System.out.println(strArray[0]);
//		System.out.println(strArray[1]);
//		System.out.println(strArray[2]);

		System.out.println(5/1);
		
		
		//System.out.println("Hello World");
		//>,<,==,<=,>=
		
//		boolean result = !((2==3) && (2==3));
//		System.out.println(result);
		
		char ch1= 'a';
		
		char ch2 = 'b';
		char ch3 = 'c';
		char ch4 = 'z';
		char cA = 'A';
		char cB = 'B';
		char cZ = 'Z';
		
		
		
		//System.out.println((int)ch1);
//		System.out.println((int)ch2);
//		System.out.println((int)ch3);
//		System.out.println((int)ch4);
//		System.out.println((int)cA);
//		System.out.println((int)cB);
		//System.out.println((int)cZ);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		float f1=sc.nextFloat();
		String s1 = sc.next();
		String s2 = sc.nextLine();
		
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?" ); 
		
		byte verySmall = 127;                                        
		short small = 30000;
		int positiveNumber = 2;
		int negativeNumber = -1;
		int bigNumber = 2147483647;
		long veryBigNumber = 922337203685477580l;
		long shortNumber = 1l;
		float pi= 3.143456789f;
		//char ch = 'a';
		
		boolean toggleTrue = true;
		boolean toggleFalse = false;
		String collectionOfCharacter = "Hello";
		double doublePi= 3.0123456789012394;
		// array collection of homogenous datatyps
		
		//dataType [] = elements which belongs to this dataTypes
		
			//	int arr [] = new int [5];
		
	    int collectInt[] = {1,2,3,4,5};
		float collectFloat [] = {1.2f,1.3f,1.4f,1.5f};
		String collectWords[] = {"hello","Hi"};
		
		
		
		   
		
		
		
		//System.out.println(strArray); // printing string array
		//System.out.println("collectInt "+collectInt);
		
//		boolean answer = (2>3);
//		System.out.println(answer);
		//char moreCharacter = 'aa';
	
//		double num1 = 18;
//		int num2 = 4;                                    //    (int)
//		double div = (num1+num2)/3;                     // BODMAS
//		System.out.println(div);                       // 7 and 7.0
//		System.out.println(num1);
		
		
//		System.out.println(shortNumber);
//		System.out.println(toggleTrue);
//		System.out.println(pi);
//		System.out.println(ch);
//		System.out.println(verySmall);
//		System.out.println(veryBigNumber);
//		System.out.println(collectionOfCharacter);
		//System.out.println(collectInt);
		
	}

}

//128 64 32 16 8 4 2 1 


//1) To print hello world (without storing hello world into String) and than with storing
//2) Design a calculator (+,-,*,/)