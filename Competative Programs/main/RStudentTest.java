package main;

public class RStudentTest {
	
	public static void main(String[] args) {
		
		RStudent rs = new RStudent("Sai ", "LPU01");
		System.out.println(rs.getStudentname());
		System.out.println(rs.getRollNumber());
		rs.setRollNumber("LPU02");
		System.out.println(rs.getRollNumber());
	}

}
