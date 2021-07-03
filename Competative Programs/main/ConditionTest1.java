package main;

import java.math.BigDecimal;
import java.util.Scanner;

//Use of if and else
// Introduce % operator remainder
// Even and odd
// display
public class ConditionTest1 {
	
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter a number will display (positive/negative)");
//		int number = s.nextInt();
//		if(number >= 0) {
//			System.out.println(number +" : Is Positive Number");
//		}
//		
//		else {
//			System.out.println(number +" : Is Negative Number");
//		}
		
		BigDecimal b1 = BigDecimal.valueOf(0.3);
		BigDecimal b2 = BigDecimal.valueOf(0.2);
		
		System.out.println(b1.subtract(b2));
		System.out.println(Math.abs(0.3)-Math.abs(0.2));
		
	
}

}
