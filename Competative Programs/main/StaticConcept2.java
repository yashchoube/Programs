package main;

public class StaticConcept2 {

	static int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		int z = 11;
		StaticConcept2 concept2 =new StaticConcept2();
		x = 88;
		concept2.y = 99;
		z = 12;
		
		StaticConcept2 concept3 =new StaticConcept2();
		System.out.println(x +"       "+concept3.y+"    "+z);
	}
}
