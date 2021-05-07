package business;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import dao.CourseDao;
import entity.Course;
import fixed.Message;

public class CourseManager {

	private List<Course> courses;
	private CategoryManager categoryManager;
	private InstructorManager instructorManager;
	
	public CourseManager() {
		this.courses = new ArrayList<Course>();
		this.categoryManager = new CategoryManager();
		this.instructorManager= new InstructorManager();
	}
	
	public void add(Course course) {
		this.courses.add(course);
		System.out.println(course.getName()+" "+Message.added);
	}
	public void delete(Course course) {
		int courseIndex= this.courses.indexOf(course);
		
		this.courses.remove(courseIndex);
		System.out.println(course.getName()+" "+Message.deleted);
	}
	
	public void update(Course course) {
		int courseIndex= this.courses.indexOf(course);
		
		this.courses.set(courseIndex, course);
		System.out.println(course.getName()+" "+Message.updated);
	}
	
	public List<CourseDao> getCourseDao(){
		return this.courses.stream().map(c->{
			
			var category = this.categoryManager.getById(c.getCategoryId());
			var instructor = this.instructorManager.getById(c.getInstructorId());
			
			return new CourseDao(
					c.getId(),
					c.getName(),
					instructor.getfName()+" "+instructor.getlName(),
					category.getName()
					);
			
		}).collect(Collectors.toList());
	}
	
	public Course getById(long id) {
		return this.courses.stream().filter(c->c.getId() == id).findFirst().get();
	}
	
	public List<Course> getAll(){
		return this.courses;
	}
}
