package main;

 class ChildtCustomClass extends ParentCustomClass{
	 @Override
	    public Integer m1() {
	        System.out.println("child m1()");
	        return 1;
	    }
	    @Override
	    public ChildtCustomClass m2() {
	        System.out.println(" child m2()");
	        return null;
	    }
}

 
	class ParentCustomClass {
	    public Object m1() {
	        System.out.println(" parent m1()");
	        return (long) 1;
	    }
	    public ParentCustomClass m2() {
	        System.out.println(" parent m2()");
	        return null;
	    }
	}
	
	public class CoVarientTypes {
	    public static void main(String[] args) {
	        ParentCustomClass class1 = new ChildtCustomClass();
	        class1.m1();
	        class1.m2();
	    }
	}
