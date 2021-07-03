package main;

public class Test88 {
	
	public static void main(String[] args) throws Exception {
		
		Operation operation = new Operation();
		System.out.println(waitAndCheck(600000,2000,operation));
	}
	
	
		public static boolean waitAndCheck (long maxWait, long waitBetweenRetry, Operation apiCall) throws Exception {
			
			boolean flag=false;
			while(maxWait>0) {
				if(apiCall.takeAction()==true) {
					flag=true;
					break;
				}
				
				maxWait-=waitBetweenRetry;
				
			}
			if(flag)
				return true;
			else
			 throw new Exception("except");
		
		}


		

	}



 class Operation{

    public boolean takeAction() {
    	return false;
    }

}
