package main;


//1. the base condition or break statement.
//2. common logic and call the function 
public class Recursion1 {

	public static void main(String[] args) {
		//Math.sqrt(a);
		
		System.out.println(getnum(5));
	}
	
	static int getnum(int n) { // n=1
		
		if(n==1) {    // 1==1
			return n;
		}

		return n+getnum(n-1);  //5+4+3+2+1= 15
		// 5+getnum(5-1)
							   // 4+getnum(4-1)
								// 3+getnum(3-1)  //2+getnum(2-1)->1
		
		//5+getnum(5-1)+4+getnum(4-1)+3+getnum(3-1)+2+getnum(2-1)
		//        10            6               3          1
		//    5+10=15           4+6 =10                3+3 =6          2+1=3
		
	}
	
	
	//5 = 5+4+3+2+1= (15)
	//12 = 6 = 3
	//13 =3
	//i=2 ;i<=3
			
	
	//10 = 5
	// 14= 7
	//20= 10
	//50=25
	//100=50=10
	// checkPrime(n=100)  {
	//  i=2 i<=10
		//n%i 13%
	
	//Last non-zero digit of the factorial
	// 4= 4*3*2*1=24 =4
	// 5= 5*4*3*2*1=120 => 2

//}
	
	
	
}
