package main;

public class TestStringProgram01 {
	
	public static void main(String[] args) {
		
	 String s = "He110 Y5a67h";
	 int sum=0;
	 char arr []=s.toCharArray();
	 for(int i=0;i<arr.length;i++) {
		 if(Character.isDigit(arr[i])) {
			 System.out.println(arr[i]);
			 sum+=Character.getNumericValue(arr[i]);
		 }
	 }
	 System.out.println("Sum "+sum);
	 
	}

}
