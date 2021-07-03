package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Evaluate {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the number of testcases..");
		int testCase = scanner.nextInt();
		scanner.nextLine();
		while(testCase-->0) {
			Map <String,String> hm = new HashMap<>();
			System.out.println("Provide input");
			String input = scanner.nextLine();
			
			
			String result="";
			
				String split[] = input.split(" ");
				for(int i =0;i<split.length;i++) {
					if(split[i].equals("a")) {
						hm.put(split[i+1],split[i+2]);		
					}
					if(split[i].equals("b")) {
						if(hm.containsKey(split[i+1]))
							result+=hm.get(split[i+1])+" ";	
						else
							result+=("-1")+" ";
					}
					if(split[i].equals("c")) {
						result+=hm.size()+" ";
					}
					if(split[i].equals("d")) {
						hm.remove(split[i+1]);		
					}
					if(split[i].equals("e")) {
						TreeMap<String, String> treeMap= new TreeMap<String, String>(hm);
						for (String string : treeMap.keySet()) {
							result+=string+" ";
						}
						
					}
					
				
			}
			
			System.out.println(result.trim());
		}
		
		
}
}
