package main;

public class TestProgram12 {
	
	public static void main(String[] args) {
		String str = "Perficient India pvt ltd";
		String result="";
		for(int i =0;i<str.length();i++) {
			if(str.matches(" ")) {
				
				continue;
			}
			else {
				System.out.println(result+=str.charAt(i));
			}
		}
		
		//System.out.println(str.replace(" ",""));
		System.out.println(result);
//		for(int i=1;i<str.length();i=i+2) {
//			
//			System.out.println(str.charAt(i));
//		}
	}

}
