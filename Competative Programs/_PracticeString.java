
public class _PracticeString {

//			  private static int rt;
//			  public static void main(String[] main) {
//				String a_b="fj";
//			    System.out.println("value "+rt);
//			    System.out.println(a_b);
//			  } 
	
//	public static void main(String[] args) {
//		String s1 = "Java";
//		String s2 = "Java";
//		StringBuilder sb1 = new StringBuilder();
//		sb1.append("Ja").append("va");
//		System.out.println(s1);
//		System.out.println(sb1);
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(sb1.toString() == s1);
//		System.out.println(sb1.toString().equals(s1));
//	}
	
//	interface HasTail { 
//		
//		int getTailLength(); 
//		
//	}
	
//	abstract class Puma implements HasTail {
//		
//	public int getTailLength() {
//		return 4;
//		}
//	}
//	
//	public class _PracticeString extends Puma {
//	
		//System.out.println(super());
		
//		public static void main(String[] args) {
//			Puma puma = new _PracticeString();
//			System.out.println(puma.getTailLength());
//		
//			_PracticeString puma2 = new _PracticeString();
//			System.out.println(puma2.getTailLength());
//			
//	}
//		
//	public int getTailLength(int length) {
//		
//		return 2;
//		
//	}
	
	public static void main(String[] args) {
//	boolean keepGoing = true;
//	int count = 0;
//	int x = 3;
//	
//	while(count++ < 3) {
//		int y = (1 + 2 * count) % 3;
//		switch(y) {
//		default:
//			case 0: x -= 1; break;
//			case 1: x += 5;
//			}
//		}
//	System.out.println(x);
//	} 
		System.out.print("a");
		 try {
		   System.out.print("b");
		   throw new IllegalArgumentException();
		 } catch (RuntimeException e) {
		   System.out.print("c");
		 } finally {
		 System.out.print("d");
		 }
		System.out.print("e");
}
	
	
}
