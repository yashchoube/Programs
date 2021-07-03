package main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SumOfNumbers {

	public static void main(String[] args) {
		Pattern  pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2= sc.next();
		
		
		if(pattern.matcher(s1).matches() && pattern.matcher(s1).matches()){
			System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		}
		else {
			System.out.println(s1+s2);
		}
	}
}
