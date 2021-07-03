package main;

import java.util.HashMap;

public class NumberOfOcc {

	public static void main(String[] args) {
		
		String name = "yash Choube";
		
		HashMap  <Character,Integer> hm = new HashMap();
		
		for(int i=0;i<name.length();i++) {
			if(!hm.containsKey(name.charAt(i))) {
				hm.put(name.charAt(i),1);
			}
			
			else {
				hm.put(name.charAt(i),hm.get(name.charAt(i))+1);
			}
		}
		
		for (Character key : hm.keySet()) {
			
			System.out.println(key+" "+hm.get(key));
			
		}
		
	}
}
