package main;

public class Complex implements B1{

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bb() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		A1 a1 = new Complex();
		A1.myMethod();
		((B1) a1).method();
	}

	
	
	

}

interface A1{
	void aa();
	static void myMethod() {
		System.out.println("Static method in Interface A1");
	}
	
}

interface B1 extends A1{
	void bb();
	default void method() {
		System.out.println("default method in Interface B1");
	}
	
}