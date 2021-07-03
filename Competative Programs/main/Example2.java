package main;

public class Example2 {
	
	public static void main(String[] args) {
		
		System.out.println(repeatSeparator("AAA", "", 0));
		
	}
	
	public static String repeatSeparator(String word, String sep, int count) {
		
		if(count==0) {
			return "";
		}
		
		String result =word;
		for (int i=0;i<count-1;i++) {
			
			result+=sep+word;
		
		}
		return result;
		  
	}


}
