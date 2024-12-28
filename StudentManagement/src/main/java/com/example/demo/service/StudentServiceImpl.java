package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentrepo;
	
	
	@Override
	public String saveStudent(Student student) {
		studentrepo.save(student);
		return "Student Added";
	}

	@Override
	public Student getStudent(int id) {
	return	studentrepo.findById(id).get();
		
	}

	@Override
	public String deleteStudent(int id) {
	studentrepo.deleteById(id);
		return "deleted student";
	}

}
