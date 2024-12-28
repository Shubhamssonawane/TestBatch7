package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class StudentController {

	@Autowired
	StudentService studentservice;

	@PostMapping("student")
	public String addStudent(@RequestBody Student student) {
		studentservice.saveStudent(student);
		return "saved";

	}

	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		return studentservice.getStudent(id);

	}
	@DeleteMapping("student/{id}")
	
	public String deleteStudent(@PathVariable    ("id") int id) {
		studentservice.deleteStudent(id);
		return "Delete student";
		
	}
	

}
