package main;

public class Tryout2 {

	public static void main(String[] args) {
		System.out.println(test());
	}
		private static int test() {
	
			int i = 0;
	
			      try {
	
			        i++;
	
			        throw new NullPointerException();
	
			      } catch (NullPointerException ex) {
	
			        return i++;
	
			      } finally {
	
			        return ++i;
	
			      }
			}
		
		//Output will be 3
	
	
}
