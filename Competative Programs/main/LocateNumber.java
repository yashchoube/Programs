package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocateNumber {
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList <ArrayList<Integer>> allList = new ArrayList<>();

	public static void main(String[] args) {
		
		System.out.println("Enter the number of input list");
		int n = scanner.nextInt();
		getInputList(n);
		isNumberPresentOnPosition();
		
		
	}

	public static void getInputList(int n) {
		
		for (int i = 0;i < n; i++) {
			System.out.println("Enter how may numbers should be there in list"+(i+1)+" and Numbers");
			int d = scanner.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int j =0;j< d;j++) {
				list.add(scanner.nextInt());
			}
			
			 allList.add(list);
			
		}		
	}
	public static void isNumberPresentOnPosition() {
		System.out.println("Enter the number of input position you will give");
		int q = scanner.nextInt();
				
		for (int i=0; i< q;i++) {
			System.out.println("Specify the position in input x,y");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
					
			try {
				List <Integer> al =allList.get(x-1);		
				System.out.println(al.get(y-1));
					
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error");
				}
		}
	}
}
