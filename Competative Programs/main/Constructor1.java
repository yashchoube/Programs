package main;

public class Constructor1 {
	
	public static void main(String args[]) {
		
		int number = 100_00;
		Constructor1 obj = new Dog();
		obj.markBark();
		System.out.println(number);
		
	}
	
	
	Constructor1(){
		System.out.println("Constructor1");
	}
	
	private void markBark() {
		System.out.println("Bark in (Parent)"+1);
	}
	
	
	
}

class Dog extends Constructor1  {
	
	Dog(){
		System.out.println("In Dog (child)");
	}
	
	 private void markBark(){
		System.out.println("Bark In (child)");
	}
}
