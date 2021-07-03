package main;


//{
//id: 1,
//name: "test1",
//role: "QA",
//project: [{"banking", "QA", "UK", 1}, {"network", "support", "AUS", 2}, {"healthcare", "dev", "US", 3}]
//}

public class Sample {

	public static void main(String[] args) {
		
		
		String arr [] = JsonPath.path("project");
		String sub[] = arr.split(",");
		for (String str : sub) {
			str.contains("healthcare");
		}
	}
	
}
