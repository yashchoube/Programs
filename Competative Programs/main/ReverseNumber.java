package main;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123;
		int reminder = 0;
		String reverseNumber ="";
		while(number>0) {
			reminder = (number%10);
			reverseNumber += String.valueOf(reminder);
			number = number/10;
			
		}
		System.out.println(reverseNumber);
	}
}
