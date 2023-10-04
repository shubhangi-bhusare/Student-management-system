package com.project.stud.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stud.management.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{
	
}
