package main;

public class TestNow {
	
	private static String str1 ="java";
	private String str2="scala";
	
	public static void java() {
		System.out.println("java");
	}
	
	public static void scala() {
		System.out.println("scala");
	}
	
	public static void main(String[] args) {
		java();
		scala();
		Integer i1 = Integer.valueOf(23);
		Integer i2 = Integer.valueOf(23);
		System.out.println(i1==i2);
		
	}

}
