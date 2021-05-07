package Entity;

public class Instructor extends User {


	private Course courseOwner;
	
	public Instructor() {
		
	}

	public Course getCourseOwner() {
		return courseOwner;
	}

	public void setCourseOwner(Course courseOwner) {
		this.courseOwner = courseOwner;
	}
}
