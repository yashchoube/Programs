package main;

class HotelParent{
	static void takePayment() {
		System.out.println("Accepted in cash");     
	}
}


public class HotelChild extends HotelParent{

	static void takePayment() {
		System.out.println("Accepted in cash as well as digital mode");
	}
	
	public static void main(String[] args) {
		HotelParent child = new HotelChild();
		child.takePayment();
	}
}
