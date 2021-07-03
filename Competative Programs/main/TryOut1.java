package main;

public class TryOut1 {

	public static void main(String[] args) {
		String s1="bug"; 
		//String s2=new String("bug");
		String s2 = "bug";
		if(s1==s2){
			System.out.println("True 1"); 
			}
		if(s1.equals(s2))
		{ 
			System.out.println("True 2");
		
		}
	}
}
// In this if String s1="same string" String s2="same string"
//than its object referance points to the same content and there referances and content 
//will also same i,e., s1==s2 and s1.equals(s2) both will return true
//But if String s2 = new string ("same string") than s1==s2 is not return true
//because here you are creating new object for that string.
//s1.equlas(s2) returns true only.