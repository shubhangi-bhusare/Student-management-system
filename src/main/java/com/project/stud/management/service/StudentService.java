package com.project.stud.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.stud.management.entity.Student;
import com.project.stud.management.repository.StudentRepository;

@Service
public class StudentService
{
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> findAll() {
		return studentRepository.findAll();
	}
	
	public Student findById(int id) {
		return studentRepository.findById(id).get();
	}
	
	@Transactional
	public Student save(Student student) {
		return studentRepository.save(student);
	}
}
