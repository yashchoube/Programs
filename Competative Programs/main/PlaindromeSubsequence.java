package main;

public class PlaindromeSubsequence {
	static String res="";
	public static void main(String[] args) {
		String str = "ABBDCACB";
		int i=0,j=str.length()-1;
		System.out.println(palindrome(str,i,j));
		System.out.println(res);
		
	}
	
	public static int  palindrome(String str,int i,int j) {
		
		if (i > j) {
            return 0;
        }
		
		if(i==j) {
			
			return 1;
		}
		if(str.charAt(i)==str.charAt(j)) {
			return palindrome(str,i+1,j-1)+2;
			
		}
		
		
			return Integer.max(palindrome(str,i,j-1),palindrome(str,i+1,j));
	
			
	}

}
