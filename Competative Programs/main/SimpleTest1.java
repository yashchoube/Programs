package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleTest1 {

	
	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		List <Integer> evenList = new LinkedList<>();
		
		for (int i=1;i<101;i++) {
			list.add(i);
			
		}
		
		for (int i=0;i<list.size();i=i+2) {
			evenList.add(i);
		}
		
		System.out.println("Solution 1: =====================>");
		for (int i=1;i<evenList.size();i++) {
			System.out.print(evenList.get(i)+" ");
		}
		
		System.out.println("Solution 2:=====================>");
		System.out.println(evenList.contains(98));
		System.out.println(evenList.contains(102));
		System.out.println(evenList.size());
		
		List <Integer> alist = new ArrayList<>(evenList);
		
		
	}
}
