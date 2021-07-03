package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
//		
//		int arr[] = new int[size];
//		
//		for (int i=0;i<size;i++) {
//			arr[i] = s.nextInt();
//		}
		
		Map <String,Integer> al = new HashMap<String,Integer>();
		String str [] = {"1","2","3","3","5"};
			
		
		for(String key: str) {
			if(!al.containsKey(key)) {
				al.put(key, 1);
			}
			else{
				al.put(key,2);
			}
		}
		
		for(String duplicate: al.keySet()) {
			
			if(al.get(duplicate)>1) {
				System.out.println(duplicate);
			}
		}
System.out.println(al);
		
		
		
		
	}

}
