package Test;

import Entity.Course;
import Entity.Instructor;
import Entity.Student;
import Service.UserManager;

public class Main {
	public static void main(String[] args) {
		Course course1=new Course();
		course1.setCourseId(1);
		course1.setCourseName("Java");
		
		Instructor instructor1 = new Instructor();
		instructor1.setCourseOwner(course1);
		instructor1.setName("Engin Demiroð");
		instructor1.setEmail("ed@gmail.com");
		instructor1.setId(1);
		instructor1.setTel("01230123");
		
		
		Student student1= new Student();
		student1.setName("Ahmet");
		student1.setStudentInstructor(instructor1);
		student1.setEmail("abc@gmail.com");
		student1.setId(1);
		student1.setStudentNumber("1234");
		
		Student student2=new Student(instructor1, "1235");
		student2.setName("Veli");
		student2.setEmail("dfe@gmail.com");
		student2.setId(2);
		
		Instructor[] instructors= {instructor1};
		Student[] students = {student1,student2};
		
	
		UserManager userManager = new UserManager();
		userManager.add(instructors);
		userManager.add(students);
	
		
	}
}
