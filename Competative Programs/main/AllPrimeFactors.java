package main;

public class AllPrimeFactors {
	public static void main(String[] args) {
		int num=8;
		
		for(int i=2;i<num;i++) {
			while(num%i==0) {
				System.out.println(i);
				num=num/i;
			}
		}
	}

}
