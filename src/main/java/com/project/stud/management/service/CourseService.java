package com.project.stud.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.stud.management.entity.Course;
import com.project.stud.management.repository.CourseRepository;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> findAll() {
		return courseRepository.findAll();
	}
	
	public Course findById(int id) {
		return courseRepository.findById(id).get();
	}
	
	@Transactional
	public Course save(Course course) {
		return courseRepository.save(course);
	}
}
