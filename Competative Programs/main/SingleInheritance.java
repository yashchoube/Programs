package main;


class BaseClass {
	
	float sal=100000;
	
	void m1() {
		System.out.println("In Baseclass Method m1");
	}
}

public class SingleInheritance extends BaseClass {
	
	float b=15000;
	float temp= sal + b;
	
	public static void main(String args[])
	{
		SingleInheritance singleInheritance = new SingleInheritance();
		singleInheritance.m1();
		System.out.println("Salary amount is:"+singleInheritance.sal);
		System.out.println(" Extra Bonous is:"+singleInheritance.temp);
	}
	

}
