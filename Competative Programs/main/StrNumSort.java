package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

//Input : ab1n7s8o9p7p
//output: ab7n9s8o7p1p

public class StrNumSort {
	public static void main(String[] args) {
		String input = "ab1n7s8o9p7p";
		String result ="";
		TreeMap <String,Integer> tm = new TreeMap<>();
	ArrayList  <Character> al= new ArrayList<>();
		for(int i =0;i<input.length();i++) {
			
			if((input.charAt(i)>=97) && (input.charAt(i)<125)) {
				continue;
			}
			

			else {
				al.add(input.charAt(i));
		
				//tm.put(input.valueOf(i),1);
			}
			
			
			
		}
		Collections.sort(al,Collections.reverseOrder());
		
		System.out.println(al);
		System.out.println(input.length());
		
for(int i =0;i<input.length();i++) {
			
			if((input.charAt(i)>=97) && (input.charAt(i)<125)) {
				result+=input.charAt(i);
				
			}

			else {
				
					for (Character character : al) {
						result+=character;
						al.remove(character);
						break;
					}
				System.out.println();
				//result+= 
				//result+=tm.get(input.valueOf(i));
				//tm.put(input.valueOf(i),i);
			}
			
			
		}

		
		//System.out.println(tm.toString());
		System.out.println(result);
		
		
		
		
	}

}


