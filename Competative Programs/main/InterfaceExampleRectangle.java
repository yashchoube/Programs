package main;

//default and static methods
public class InterfaceExampleRectangle implements Shape1 {

	
	public static void main(String[] args) {
		System.out.println(constant);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Rectangle");
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		
	}

	
}

interface Shape1{
	int constant=10;
    void draw();
    
    //default public void getData();
    
}