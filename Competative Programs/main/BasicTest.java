package main;

import java.util.Arrays;

public class BasicTest {
	public static void main(String[] args) {
//		int arr [] = {1,4,2,3,6,5};
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
//		Arrays.sort(arr);
//	System.out.println(arr[arr.length-1]);	
		m();
		System.out.println("codre");
	}
	static void m() {
		try {
			m();
		}
		catch(StackOverflowError e) {
			e.printStackTrace();
		}
	}
	

}
