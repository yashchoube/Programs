package main;

public class Square {
	public static void main(String[] args) {
		int s=10; //s->10
		
		Area area1 = new Area();
		
		
		System.out.println(area1.getArea(s));  // s=10
	
		System.out.println("==============================================================");
		Area area2 = new Area(12);
		area2.getAreaByConstructor();
		
		
	}

}

 class Area {
	int side;
	
	public Area(){
		
	}
	
	public Area(int side) {
		this.side=side;
		System.out.println("In constructor");
	}
	
	
	public int getArea(int side) { // side = 10;
		System.out.println("-----------------------------------");
		System.out.println("Area");
		//System.out.println(side*side);
		return side*side;
	} 
	
	public void getAreaByConstructor() {
		System.out.println("-----------------------------------");
		System.out.println("AreaByConstructor");
		System.out.println(side*side);
	}
	
}
