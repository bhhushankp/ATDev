package com.atdev.service;

import java.util.List;

import com.atdev.model.Student;

public interface StudentService {
	
	
	public Student createStudent(Student s);
	
	public Student updateStudent(Integer rollNo,Student s);
	
	public Student getStudent(Integer rollNo);
	
	public List<Student> getAllStudent();
	
	public void deleteStudent(Integer rollNo);
}
