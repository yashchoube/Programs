package main;

public class TestExample86 {
	public static void main(String[] args) {
		String str[]= {"jaipur","delhi", "bangalore", "kolkata"};
		for(String word:str) {
			int num=display(word);
			if(num==1) {
				System.out.println(word);
			}
		}
	}
	
	static int display(String s) {
		int b=1;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					b= -1;
				break;
				}
				
			}
		}
		return b;
		
	}

}
