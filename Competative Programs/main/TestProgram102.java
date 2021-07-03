package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TestProgram102 {
	
	public static void main(String[] args) {
		
		getInputData();
	}

	private static void getInputData() {
		List<HashMap<String,Object>> data = new ArrayList<HashMap<String,Object>>();
		Map <String, Object> hm = new HashMap<String,Object>();
		// TODO Auto-generated method stub
		Random random = new Random();
		int positiveInput =random.nextInt(10);
		int negativeInput =	random.nextInt(0);
		float decimal = random.nextFloat();
		String specialCharacter= "@%$#";
		String oneChar= "A";
		String emptyString="";
		String properInput="Hello Yash";
		//Edge Case
		String name1= "Apppppppppppppppppppppp";
		int age = 1;
		
		
		
		
		//Positive flow
		hm.put("Name",properInput );
		hm.put("Age", positiveInput);
		data.add((HashMap<String, Object>) hm);
		
		
		hm.put("Name",negativeInput );
		hm.put("Age", positiveInput);
		data.add((HashMap<String, Object>) hm);
		
		
		
		
	}

}
