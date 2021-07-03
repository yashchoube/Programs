package main;

//Child
public class AbsExample extends Draw{
	
	public static void main(String[] args) {
		
		AbsExample ab = new AbsExample();
		ab.make();    //Making AbsExample class 
		ab.getData(); //From abstract class
		ab.constant =10; 
		System.out.println(ab.change++);//10
	}

	@Override
	void make() {
		// TODO Auto-generated method stub
		
	}

	

	
	
	

}

 //abstract methods: methods without body(declaring of methods) no implemenmtation.
//Parent
abstract class Draw{
	
	int constant;
	int change = 10;
	 abstract void make();
	 
	 void getData() {
		 System.out.println("From abstract class");
	 }
	 
	
}
