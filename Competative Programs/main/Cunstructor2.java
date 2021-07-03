package main;

public class Cunstructor2 extends Verify {

	static int glolbal = 1111;
	//public static final int rint ;

	
	Cunstructor2(){
		System.out.println("Cunstructor2");
	}
	
	void abstractMethod() {
		
		System.out.println("calling from parent abstractMethod()");
	}
	
	public void nonStaticMethod1() {
		glolbal++;
		System.out.println(glolbal+"In method");
		System.out.println("In child :nonStaticMethod1");
	}
	int i;
	public static void main(String[] args) {
		
	final int x = 10;
    int y=13;
	Verify verify =  new Cunstructor2();
	System.out.println(verify.x);
	verify.staticMethod1();
	verify.nonStaticMethod1();
	System.out.println(y);
	
	Cunstructor2 coCunstructor2 =  new Cunstructor2();
//	System.out.println("-------------------------------------");
//	System.out.println(coCunstructor2.x);
//	staticMethod1();
//	coCunstructor2.nonStaticMethod1();
//	System.out.println(y);
	
	System.out.println(x);
	staticMethod1();
	
	System.out.println("------------");
	
	Verify verify3 = new Verify();
	
	System.out.println("bahar"+glolbal);

	}
	

}

  class Verify {
	
	int x =11;
	static int y = 12;
	int z = 11;
	
	Verify(){
		System.out.println("you are in Abstract class constructor");
	}
	static void staticMethod1() {
		System.out.println("staticMethod1");
	}
	public void nonStaticMethod1() {
		System.out.println("nonStaticMethod1");
	}
	//abstract  void abstractMethod(); 
	
}
