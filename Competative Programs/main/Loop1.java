package main;

import java.util.Scanner;

public class Loop1 {
	
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		int bricks=10;
		while(bricks>0) {
			System.out.println(bricks);
			System.out.println("Pick up brick");
			System.out.println("Keep it on wall");
			bricks--;
		}
	}

}
