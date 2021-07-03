package main;

public class TestProgram16 {
	public static void main(String[] args) {
		int n=5;
		int count=0;
		for(int i=0;i<2*n;i++) {
			count++;
			if(count<=5) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			}
			//System.out.println();
			
			if(count>5) {
				System.out.println(i-n);
			for(int j=n-1;j>i-n;j--) {
				System.out.print("*");
			}
//			
			}
			System.out.println();
			
		}
//		for(int i=0;i<n-1;i++) {
//			
//			System.out.println();
//		}
//		
		
	}
	

}
