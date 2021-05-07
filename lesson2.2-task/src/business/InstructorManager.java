package business;

import java.util.ArrayList;
import java.util.List;

import entity.Course;
import entity.Instructor;
import fixed.Message;

public class InstructorManager {

	private List<Instructor> instructors;
	
	public InstructorManager() {
		this.instructors = new ArrayList<Instructor>();
		
		this.instructors.add(new Instructor(1, "Engin", "Demirog", "engin@gmail.com", "engindemirog",
				"1234", "Egitmen"));
	}
	
	public void add(Instructor instructor) {
		this.instructors.add(instructor);
		System.out.println(instructor.getfName()+" "+Message.added);
	}
	public void delete(Instructor instructor) {
		int courseIndex= this.instructors.indexOf(instructor);
		
		this.instructors.remove(courseIndex);
		System.out.println(instructor.getfName()+" "+Message.deleted);
	}
	
	public void update(Instructor instructor) {
		int courseIndex= this.instructors.indexOf(instructor);
		
		this.instructors.set(courseIndex, instructor);
		System.out.println(instructor.getfName()+" "+Message.updated);
	}
	
	public Instructor getById(long id) {
		return this.instructors.stream().filter(i-> i.getId() == id).findFirst().get();
	}
	
	public List<Instructor> getAll(){
		return this.instructors;
	}
}
