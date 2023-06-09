package com.atdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atdev.helper.Resource;
import com.atdev.model.Student;
import com.atdev.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@PostMapping("/POST")
	public ResponseEntity<Student> createStudent(@RequestBody Student s) {
		Student student = ss.createStudent(s);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@PutMapping("/PUT/{rollNo}")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer rollNo,@RequestBody Student s){
		Student student = ss.updateStudent(rollNo, s);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping("/GET/{rollNo}")
	public ResponseEntity<Student> getUser(@PathVariable Integer rollNo){
		Student student = ss.getStudent(rollNo);
		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}
	
	@GetMapping("/GET")
	public ResponseEntity<List<Student>> getAllStudent()
	{
		List<Student> students = ss.getAllStudent();

		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	@DeleteMapping("/DELETE/{rollNo}")
	public ResponseEntity<Resource> deleteUser(@PathVariable Integer rollNo)
	{
		ss.deleteStudent(rollNo);
		return new ResponseEntity<Resource>(new Resource("Student Deleted Succesfully",true),HttpStatus.OK);
	}
	
	
}



