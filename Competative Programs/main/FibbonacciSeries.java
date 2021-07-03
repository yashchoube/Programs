package main;

public class FibbonacciSeries {
	
	public static void main(String[] args) {
		
		int number = 6;
		int n1=0;
		int n2=1;
		int count=0; 
		System.out.print(n1+" "+n2);
		while(count!=number) {
			int n3=n1+n2;
			n1=n2;
			
			n2=n3;
			System.out.print(" "+n3+" ");
			count++;
			
		}
	}

}
