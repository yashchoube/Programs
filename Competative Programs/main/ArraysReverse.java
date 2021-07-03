package main;

import java.util.Arrays;
import java.util.Collections;

public class ArraysReverse {
	public static void main(String[] args) {
		Integer [] arr = {0,1,1,1,0,0};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
	
	

}
