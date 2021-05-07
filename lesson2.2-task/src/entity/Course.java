package entity;

import java.util.Date;

public class Course {

	private long id;
	private long instructorId;
	private long categoryId;
	private String name;


public Course() {} 
	
	
	public Course(long id, long instructorId, long categoryId, String name) {
		this.id = id;
		this.instructorId = instructorId;
		this.categoryId = categoryId;
		this.name = name;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
