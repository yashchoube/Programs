package main;

public class longestPalindromRemoveCharacter {
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		StringBuffer sb = new StringBuffer(str);
		
		String strReverse= new String(sb.reverse());
		String res="";
		String strMax="";
		int maxlength =0;
		int count=0;
		
		// ablkab
		// baklba
		for(int i=0;i<str.length();i++) {
			int l=i,r=i+1;
		
			while(l>=0 && r<str.length() && strReverse.charAt(l)==strReverse.charAt(r)){
				res=strReverse.substring(l, r+1);
				l--;
				r++;
				//System.out.println(res);
				count++;
				
			}
			
			if(maxlength<=res.length()) {
				strMax=res;
				maxlength=res.length();
			}
			
			//System.out.println(count);
			
		}
		
		System.out.print(strMax);
		
		
	}

}
