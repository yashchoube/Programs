package main;

public class StaticConcept {

	static int statvar = 10;
	int globalvariable = 12;
	
	public static void main(String[] args) {
		StaticConcept staticConcept = new StaticConcept();
		
//		System.out.println(statvar);
//	    System.out.println(staticConcept.globalvariable);
//	    
//	    statvar = 100;
//	    staticConcept.globalvariable = 120;
	    
	    System.out.println(statvar);
	    System.out.println(staticConcept.globalvariable);
	    
	    staticConcept.increment();
	    System.out.println("---------");
	    System.out.println(statvar);
	    System.out.println(staticConcept.globalvariable);
		
	}
	
	void increment() {
		System.out.println("In increment");
		statvar++;
		globalvariable++;
		System.out.println(statvar);
	    System.out.println(globalvariable);
		
	}
}
