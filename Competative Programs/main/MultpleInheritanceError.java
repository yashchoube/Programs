package main;

//A Grand parent class in diamond 
class GrandParent 
{ 
	void fun() 
	{ 
		System.out.println("Grandparent"); 
	} 
} 

//First Parent class 
class Parent11 extends GrandParent 
{ 
	void fun() 
	{ 
		System.out.println("Parent1"); 
	} 
} 

//Second Parent Class 
class Parent22 extends GrandParent 
{ 
	void fun() 
	{ 
		System.out.println("Parent2"); 
	} 
} 


//Error : Test is inheriting from multiple 
//classes 
public class MultpleInheritanceError extends Parent11, Parent22 { 
	public static void main(String args[]) 
	{ 
		MultpleInheritanceError multpleInheritanceError = new MultpleInheritanceError(); 
		multpleInheritanceError.fun(); 
	} 
} 
