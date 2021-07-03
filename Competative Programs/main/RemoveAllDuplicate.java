package main;

public class RemoveAllDuplicate {
	public static void main(String[] args) {
		String name = "apple";
		String res="";
		
		for(int i=0;i<name.length();i++) {
			for(int j =i;j<name.length()-1;j++) {
				if(name.charAt(j)==name.charAt(j+1)) {
					j=j+2;
					break;
				}
				res+=name.charAt(j);
			}
		}
		System.out.println(res);
	}

}
