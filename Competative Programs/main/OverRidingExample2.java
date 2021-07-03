package main;

public class OverRidingExample2 extends ParentExample{
	
	public void fun() {
		
		System.out.println("Child Fun");
	}
	 
	 public static void main(String[] args) {
		 ParentExample oe =  new OverRidingExample2();
		 oe.fun();
	}
	
	

}
// Public,Protected,default,Private

class ParentExample{
	
	protected void fun() {
		System.out.println("Parent Fun");
	}
	
//	private void fun() {
//		System.out.println("Parent Fun");
//	}
	
	
}