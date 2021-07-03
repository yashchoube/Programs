package main;
//static,final,private
//Public protected default private

public class RuntimePolyChild extends RuntimePolyParent{
	public void function() {
		System.out.println("In Child Function");
	} 
	
	public static void main(String[] args) {
		RuntimePolyParent runtimePolyParent = new RuntimePolyParent();
		runtimePolyParent.function();
	}

}

class RuntimePolyParent{
	public void function() {
		System.out.println("In Parent Function");
	}
	
}
