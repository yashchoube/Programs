package main;

public class Sum1 {

	public static void main(String[] args) {
		
		System.out.println(loneSum(3,3,3));


	}
	
	public static int loneSum(int a, int b, int c) {
		  
		 if((a!=b) && (b!=c) && (a!=c)) {
			    return a+b+c;
			  }
			  
			  else if((a==b) && (b!=c)) {
			    return c;
			  }
		 
			  else if((a==c) && (b!=c))
			    return b;
			  
			  else if((b==c) && (a!=c))
				  return a;
			  else 
				  return 0;
		
			}
}
