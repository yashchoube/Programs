package main;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "abcdefghiedcba";
		System.out.println(isPalindrome(str));
		
	}
	
	public static boolean isPalindrome(String str){
		String res= "";
		String longestPalindrome="";
		int maxlength =0;
		for(int i=0;i<str.length();i++) {
			int l=i,r=i;
			while(l>=0 && r<str.length() ) {
				if(str.charAt(l)!=str.charAt(r)) {
				
					return false;
			}
			
				res=str.substring(l,r+1);		
				r++;
				l--;
			
//			if(maxlength<=res.length()) {
//				maxlength= res.length();
//				longestPalindrome=res;
//				//System.out.println(res);
//			}
		}
			return true;
		}
	}
		
}

