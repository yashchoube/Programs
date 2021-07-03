package main;

 class Shape {
	protected String Inshape = "ShapeClass";
	public Shape() {
		System.out.println("In Shape Constructor");             
	}
	   public void shapeDisplay() {
	      System.out.println("Inside display");
	   }
	}
 
	class Rectangle extends Shape {
		
		 int dimension = 2;
		
		String Inrectangle = "RectangleClass";
		public Rectangle() {
			System.out.println("In Rectangle Constructor");
		}
	   public void rectangleArea() {
	      System.out.println("Inside area");
	   }
	   
	   public void  show() {
		   System.out.println("Rectangle show ");
		  System.out.println(Inshape);
	   }
	}
	
	class Cube extends Rectangle {
		
		int dimension = 3;
		String Incube = "CubeClass";
		
		public Cube() {
			System.out.println("In Cube Constructor");
		}
		
		public Cube(int s) {
			System.out.println("Cube "+s);
			System.out.println("In Cube parameterized Constructor");
		}
		
	   public void cubeVolume() {
	      System.out.println("Inside volume");
	      //System.out.println(dimension);
	      //System.out.println(super.dimension);
	   }
	   
	   public void  show() {
		  
		   System.out.println("Cube show ");
		   super.show();
		   System.out.println(Inshape);
	   }
	}
	
public class TestMulInheritance {
	public static void main(String[] arguments) {
	      Cube cube = new Cube(5);
	      cube.shapeDisplay();
	      cube.rectangleArea();
	      cube.cubeVolume();
	      cube.show();
	   }
}
