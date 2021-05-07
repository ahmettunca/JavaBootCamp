package dao;

public class CourseDao {
	private final long id;
	private final String courseName;
	private final String instructorName;
	private final String categoryName;

	public CourseDao(long id, String courseName, String instructorName, String categoryName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructorName = instructorName;
		this.categoryName = categoryName;
	}
	public long getId() {
		return id;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
}
