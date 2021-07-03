package main;

public class TestCustomException {
	
	static void validate(int age)throws InvalidAgeException{  
	     if(age<18)  
	      throw new InvalidAgeException("not valid");  
	     else  
	      System.out.println("welcome to vote");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(15);  
	      }
	      catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      finally{
	    	  try {
				validate(10);
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	  //System.out.println("rest of the code..."); 
	      }
	      
	      
	      TestCustomException customException = new TestCustomException();
	      System.out.println(customException instanceof TestCustomException);
	  }  

}
class InvalidAgeException extends Exception{  
	 InvalidAgeException(String s){  
	  super(s);  
	 }  
	}  