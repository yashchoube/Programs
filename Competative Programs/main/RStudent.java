package main;

public class RStudent {
	
	private String collegeName = "LPU";
	private String studentname;
	private String rollNumber;
	
	public RStudent(String studentname, String rollNumber) {
		this.studentname = studentname;
		this.rollNumber = rollNumber;
		System.out.println("In Constructor");
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	

}
