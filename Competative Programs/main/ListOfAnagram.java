package main;

import java.util.ArrayList;
import java.util.List;

public class ListOfAnagram {
	public static void main(String[] args) {
		String str[]= {"act","god","act","dog","act"};
		//System.out.println(Anagrams(str));
		long arrInput [] = new long[str.length];
		int i=0;
		for (String string : str) {
			arrInput[i++]=string.hashCode();
		}
		
		System.out.println("hello");
		for(int j=0;j<arrInput.length;j++)
			System.out.print(arrInput[j]+" ");
//		int input [] = new int[26];
//		String str1="abc";
//		for (char ch : str1.toCharArray()) {
//			input[ch-'a']++;
//			
//		}
//		


//	public static List<List<String>> Anagrams(String[] string_list) {
//        List<String> list1 = new ArrayList<>();
//        List <String> list2 = new ArrayList<>();
//        // Your Code here
//        for (String word : string_list) {
//			isAnagram(word);
//		}
//        
//    }

//	private static void isAnagram(String word) {
//		// TODO Auto-generated method stub
//		Arrays.sort()
	}
}
