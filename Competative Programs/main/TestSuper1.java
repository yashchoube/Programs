package main;

public class TestSuper1 {
	public static void main(String args[]){  
		Dog1 d=new Dog1();  
		d.printColor();  
}
	
//	class TestExampleAccess{
//		void funDisplay() {
//			new Animal().color;
//		}
//	}
}
class Animal{  
protected String color="white";  
public Animal(){
	System.out.println("In Animal Constructor");
}
public void getNameOfClass() {
	System.out.println("Animal");
}
} 

class Dog1 extends Animal{  
	String color="black";  
	
	Dog1(){
		super();
		System.out.println("In Dog Constructor");
	
	}
	void printColor(){  
		super.getNameOfClass();
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
}  
}  
  