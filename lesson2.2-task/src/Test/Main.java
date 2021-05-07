package Test;

import business.CourseManager;
import entity.Course;

public class Main {
	public static void main(String[] args) {
		courseMainTest();
	}
	
	public static void courseMainTest() {
		CourseManager courseManager = new CourseManager();
		courseManager.add(new Course(1, 1, 1, "Java & React Kursu"));
		courseManager.add(new Course(2, 1, 2, "C# & Angular Kursu Kursu"));
		
		System.out.println("|id|Course|Instructor|Category|");
		System.out.println("|---|---|---|---|");
		courseManager.getCourseDao().forEach(c->{
			System.out.println("|"+c.getId()+"|"+c.getCourseName()+"|"+c.getInstructorName()+"|"+c.getCategoryName()+"|");
		});
	}
}
