package main;

public class Tryout5 {

		protected Object dStringo() throws Exception{
			return null;
		
		}

		public static void main(String[] args) {
			Tryout5 t1 = new NewB1();
			try {
				System.out.println(((NewB1) t1).dStringo());
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				System.out.println(t1.dStringo());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//t1.dStringo();
			
			
		}


		class NewB1 extends Tryout5 {

		public String dStringo() throws Throwable{
			return "Hello";
		}

		}
		

