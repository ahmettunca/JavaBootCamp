package Entity;

public class Student extends User {

	private Instructor studentInstructor;
	private String studentNumber;
	private int studentCounter=0;
	
	public Student() {
		
	}

	public Student(Instructor studentInstructor, String studentNumber) {
		super();
		this.studentInstructor = studentInstructor;
		this.studentNumber = studentNumber;
	}

	public Instructor getStudentInstructor() {
		return studentInstructor;
	}

	public void setStudentInstructor(Instructor studentInstructor) {
		this.studentInstructor = studentInstructor;
	}


	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public int getStudentCounter() {
		return studentCounter;
	}

	public void setStudentCounter(int studentCounter) {
		this.studentCounter = studentCounter;
	}
}
