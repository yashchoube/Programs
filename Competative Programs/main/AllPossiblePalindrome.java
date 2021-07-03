package main;

public class AllPossiblePalindrome {
	    public static void main(String args[]) {
	      String str ="aba";
	      System.out.println(str.length());
	      boolean result;
	      int count=0;
	      for(int i=0;i<str.length();i++){
	          for(int j=i;j<str.length();j++){
	            result=IsPalindrome(str.substring(i,j+1));
	            if(result==true){
	                count++;
	            }
	      
	      }
	      }
	      
	      System.out.println(count);
	    }
	    
	    static boolean IsPalindrome(String s){
	        StringBuffer sb = new StringBuffer(s);
	        String res = new String(sb.reverse());
	        if(res.equals(s) && !res.equals("")){
	            System.out.println("res "+res +" s "+s);
	            return true;
	        }
	        else
	            return false;
	    }
	
}
