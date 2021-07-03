package main;

public class Inheritance1 extends ParentOfInheritance {
	
	int j = 6;
	
	public Inheritance1() {
		System.out.println("In Child Relation constructor");
	}
	
	public void getValueInChild() {
		System.out.println("Value from Child "+j);
		System.out.println(super.j);
	}
	
	public static void main(String[] args) {
		Inheritance1 i1 = new Inheritance1();
		i1.getValueInChild();
		i1.getValue();
	}
	
}

class ParentOfInheritance extends GP{
	
	int j=5;
	
	ParentOfInheritance(){
		System.out.println("Parent1 Constructor");
	}
	
	public void getValue() {
		System.out.println("Value "+j);
		System.out.println(super.j);
	}
	
}

class GP   {
	int j =4;
}
