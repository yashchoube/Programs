package main;

public class ParentChildRelationship1 {
	
public static void main(String[] args) {
	byte a = 127; byte b = 127; 
	String str;
	//b = a + b; 
	System.out.println(b+=a);
	System.out.println(10+20+"Helloworld");
	System.out.println("Helloworld"+10+20);
	Parent1 p1 = new Child2 ();
	p1.inparent();
	((Child2) p1).inchild2();
	((Child1) p1).inchild1();
}
	

}

class Parent1 {
	
	void inparent() {
		
		System.out.println("In parent");
	
	}
}

class Child1 extends Parent1 {
	void inchild1() {
		System.out.println("In child1");
	}
	
}

class Child2 extends Child1{
	void inchild2() {
		super.inchild1();;
		System.out.println("In child2");
	}
}