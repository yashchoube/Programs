package main;

import java.util.Arrays;

public class TestString02 {
	
	public static void main(String[] args) {
		int count=0;
//		String str= "apple";
//		char [] chararray= str.toCharArray();
//		
//		System.out.println(str.substring(0, 4));
//		String strarray[]=str.split(",");
//		
//		for (String string : strarray) {
//			System.out.println(string);
//		}
		
//		for(int j=str.length()-1;j>=0;j--) {
//			System.out.print(str.charAt(j));
//			
//		}
//		System.out.println(str.charAt(2));
//		System.out.println(str.length());
		int array[]= {1,3,3,5,2,2};
		Arrays.sort(array);
		//1,2,3,4
		for(int i=0;i<array.length-1;i++) {
		if(array[i]==array[i+1]) {
			count++;
		}
		System.out.println(count);
		
	}
		

}
}
