package main;

import java.util.LinkedList;

public class StringMostRepeating {
	public static void main(String[] args) {
		String str= "aaabbbcccc";
		int beg = 0;
		int end = 0;
		int count = 0;
		int max = 0;
		for(int i=0;i<str.length();i++) {
			count=0;
			//for(int j=i;j<str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					break;
				}
				else {
					++count;
					if(count>max) {
						beg=i;
						//end =j+1;
						max=count;
						
					}
				}
				
			//}
		}
		System.out.println("count "+max +" start "+beg+" end ");
		//System.out.println("Substring "+ str.substring(beg,end+1));
		
		
	}

}
