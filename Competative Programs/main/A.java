package main;


// Use of super 
public class A extends B{
	public A(int a) {
		super(a);
	}
	public static void main(String[] args) {
		A b = new A(5); 
	}
	
}



 class B {
	
	 private int a;
		public B (int a) {
			this.a=a;
			System.out.println(a);
		}
	}
