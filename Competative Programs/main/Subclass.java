package main;


public class Subclass extends superclass {
 int a=12;
	Subclass(int a,int b){
		
		System.out.println("Subclass");
	}
	void method() {
		
		System.out.println("In Sub Class");
	}
	
	void newMethod() {
		super.d=10;
		System.out.println(d);
		System.out.println("New Method");
	}

	public static void main(String[] args) {
		superclass obj = new Subclass(2,3);
		//obj.method();
		//obj.newMethod();
		//System.out.println(a);
		//" "+b+" "+c);
	}
}


class superclass {
	int a=10;
	static int b= 10;
	final int c=10;
	int d;
	void method() {
		System.out.println("In Super Class");
	}
	
	superclass(){
		System.out.println("superclass");
	}
}