package main;

import java.util.HashMap;
import java.util.Map;

public class TestExample90 {
	
	public static void main(String[] args) {
		String str= "google";
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
			}
			else {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		}
		
		for(Character ch:hm.keySet()) {
			System.out.println(ch+" "+hm.get(ch));
		}
	}
//loginpage	
	
	//
	public void enterEmail() {
		//waiting
		email.clear();
		email.sendKeys("yyyyy");
		
	} 
	
	public void enterPassword() {
		//waiting
		email.clear();
		email.sendKeys("yyyyy");
		
	}
	
	
	
	@given
	public login() {
		getDriver().getLoginClass().login();
	}

	RestAssured.BaseURi= " http://www.abc.com";
	Response response = ReastAssured.given().auth().basic("","")header()get("/getUsers").extract();
	Assert.assertEquals(response.getStatusCode(),200);
	
	
}
