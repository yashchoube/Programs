package main;

//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

public class OverlodindExample {
	
	public void area(int r) {
		float pi=3.14f;
		System.out.println("area of a circle");
		System.out.println(pi*r);
	}
	
	public void area (int l,int b) {
		System.out.println("Area of rectnagle");
		System.out.println(l*b);
	} 
	
	public void area (int l,int b,int h) {
		System.out.println("Area of cubiod");
		System.out.println(l*b*h);
	}
	
	public static void main(String[] args) {
		OverlodindExample obj = new OverlodindExample();
		obj.area(10, 2,4);
		
	}

}
