package main;

import java.util.HashSet;
import java.util.Set;

public class SubstringNotRepeating {
	
	public static void main(String[] args) {
		int count;
		int max=0;
		int beg = 0;
		int end = 0;
		String st = "aaabbbcccc";	
		for(int i=0;i<st.length()-1;i++) {
			count=0;
			for(int j=i;j<st.length()-1;j++) {
				if(st.charAt(j)==st.charAt(j+1)) {
					break;
				}
				count++;
				if(count>max) {
					max=count;
					beg=i;
					end=j+1;
					
				}
			}
			
			
			
	
//		String output = "";
//		String input="abbaccdef";
//	    for (int start = 0; start < input.length(); start++) {
//	        Set<Character> visited = new HashSet<>();
//	        int end1 = start;
//	        for ( end1=end1; end1 < input.length(); end1++) {
//	            char currChar = input.charAt(end1);
//	            if (visited.contains(currChar)) {
//	                break;
//	            } else {
//	                visited.add(currChar);
//	            }
//	        }
//	        if (output.length() > end1 - start + 1) {
//	            output = input.substring(start, end1);
//	        }
//	
//	
//	
//	}
	//    System.out.println(output);
//		
		System.out.println(st.substring(beg, end+1));
	}
	}
	

}

