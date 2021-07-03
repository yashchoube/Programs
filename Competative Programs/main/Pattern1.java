package main;

public class Pattern1 {
	public static void main(String[] args) {
		
	
		int i, j, row = 6;      //i-> row
		for (i=0; i<row; i++)   
		{  
		for (j=row-i; j>1; j--)   // j=6 
		{  
		System.out.print(" ");   
		}   
		for (j=0; j<=i; j++ )   //i=1; j=0,1
		{       
		System.out.print("* ");   
		}    
		System.out.println();   
		}   

}
	}


//123 =>1+2+3=>6
//1=>1
//1200=1+2+0+0=>3
//333=3=3=3=>9






