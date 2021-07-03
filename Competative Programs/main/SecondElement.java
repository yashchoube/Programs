package main;

import java.util.Collections;
import java.util.Scanner;

public class SecondElement {
	
	public static void main(String[] args) {
		result();
	}
	 
	
	 static void result() {
		 Scanner sc = new Scanner(System.in);
		 
		 int arr [] = {1,2,3,5,7,-2,-3};
		 int tempo;
		 for(int i = 0; i<arr.length;i++) {
			 for (int j = i+1; j< arr.length; j++) {
				 if(arr[i]>arr[j]) {
					tempo = arr[i];
					arr[i] =arr [j];
					arr[j] = tempo;
				 }
			 }
		 }
		 System.out.println("Second minimum "+ arr[1]);
		 
	 }
	 

}
