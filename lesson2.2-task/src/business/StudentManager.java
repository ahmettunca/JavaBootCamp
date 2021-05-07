package business;

import java.util.ArrayList;
import java.util.List;

import entity.Student;
import fixed.Message;

public class StudentManager {
	
private List<Student> students;
	
	public StudentManager() {
		this.students = new ArrayList<Student>();
	}
	
	public void add(Student student) {
		this.students.add(student);
		System.out.println(student.getfName()+" "+Message.added);
	}
	public void delete(Student student) {
		int courseIndex= this.students.indexOf(student);
		
		this.students.remove(courseIndex);
		System.out.println(student.getfName()+" "+Message.deleted);
	}
	
	public void update(Student student) {
		int courseIndex= this.students.indexOf(student);
		
		this.students.set(courseIndex, student);
		System.out.println(student.getfName()+" "+Message.updated);
	}
	
	public Student getById(long id) {
		return this.students.stream().filter(i-> i.getId() == id).findFirst().get();
	}
	
	public List<Student> getAll(){
		return this.students;
	}
}
