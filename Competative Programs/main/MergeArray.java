package main;

import java.util.Arrays;

public class MergeArray {
	
	public static void main(String[] args) {
		int arr1 []= { 1, 10, 20, 40, 50};
		int arr2 []= { 1, 5, 10, 20, 20, 65, 100};
		int result []= new int [arr1.length+arr2.length];
		int k=0;
	
		String str= "abcd";
		
		for(int i =0;i<arr1.length;i++) {
			result[i]=arr1[i];
		}
		
		for(int i =arr1.length;i<arr2.length+arr1.length;i++) {
			result[i]=arr2[k++];
		}
		
		Arrays.sort(result);
		
		for(int i =0;i<arr2.length+arr1.length;i++) {
			System.out.println(result[i]);
		}
		
	}

}
