package com.atdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atdev.exception.StudentNotFoundException;
import com.atdev.model.Student;
import com.atdev.repository.StudentRepository;
import com.atdev.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository sr;

	@Override
	public Student createStudent(Student s) {
		Student student = sr.save(s);
		return student;
	}

	@Override
	public Student updateStudent(Integer rollNo, Student s) {
		Student student = sr.findById(rollNo).orElseThrow(()-> new StudentNotFoundException("Student","rollNo",rollNo));
		student.setFname(s.getFname());
		student.setLname(s.getLname());
		student.setMobileNo(s.getMobileNo());
		student.setAddress(s.getAddress());
		Student saveStudent = sr.save(student);
		return saveStudent;
	}

	@Override
	public Student getStudent(Integer rollNo) {
		Student student = sr.findById(rollNo).orElseThrow(()-> new StudentNotFoundException("Student","rollNo",rollNo));

		return student;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> students = sr.findAll();
		return students;
	}

	@Override
	public void deleteStudent(Integer rollNo) {
		Student student = sr.findById(rollNo).orElseThrow(()-> new StudentNotFoundException("Student","rollNo",rollNo));
		sr.delete(student);
		
	}

}
