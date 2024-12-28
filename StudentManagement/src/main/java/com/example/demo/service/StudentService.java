package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {

	public String saveStudent(Student student);
	
	public Student getStudent(int id);
	
	public String deleteStudent(int id);

	
	
}
