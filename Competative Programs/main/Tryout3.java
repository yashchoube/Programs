package main;

public class Tryout3 {

	public static void main(String[] args) {
		int b[] = {6,1,2,4,5,3};
		reverse(b);
		//for(int i:reverse(b)) { 
		//System.out.println(i);
	}
	
		public static void reverse(int[] a){ 
			int rev[]=new int[a.length]; 
			for(int i=0; i<a.length; i++) { 
				rev[i]=a[a.length-i-1];
				System.out.println(rev[i]);
		} 
			
			}

}
