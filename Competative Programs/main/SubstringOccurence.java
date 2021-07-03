package main;

public class SubstringOccurence {
	
	static int index;
	
	public static void main(String[] args) {
		String str="geeksforgeeks";
		String search ="eeks";
		int count=0;
		String oldstr=str;
		for(int i=0;i<str.length();i+=search.length()) {
			//StringBuilder findIn = new StringBuilder(str.substring(index, str.length()-1));
			if(index>=0  ) {
			String find = oldstr.substring(index, oldstr.length());
			if(find.contains(search)) {
				System.out.println(find+" "+search + " " +(++count));
				
			
			}
			String newStr=find.replaceFirst(search, "nn");
			oldstr=newStr;
			System.out.println(newStr);
			index=newStr.indexOf(search);
			//System.out.println(index);
			
		}
		}
		for(int i=0;i<str.length();i++)
		System.out.println(str.subSequence(i, str.length()));
	}
	

}
