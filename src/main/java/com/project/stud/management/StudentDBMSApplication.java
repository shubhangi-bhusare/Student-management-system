package com.project.stud.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.stud.management.entity.Course;
import com.project.stud.management.entity.Student;
import com.project.stud.management.service.CourseService;
import com.project.stud.management.service.StudentService;

@SpringBootApplication
public class StudentDBMSApplication implements CommandLineRunner
{
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentDBMSApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Student student = new Student("Aditya");
		studentService.save(student);
		Course course = new Course("Spring Boot");
		courseService.save(course);
		student.addCourse(course);
		studentService.save(student);
		course.addStudent(student);
		courseService.save(course);
	}

}
