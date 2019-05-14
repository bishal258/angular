package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Student;

public interface StudentDAO {
	
	List<Student> getAllStudents();
	
	Student getAStudent(int id);
	
	Student updateStudent(String id, Student student);
	
	 void deleteStudent (int id);
	 
	 void saveStudent(Student student);
	 
	 Student getByName(String name);
	
}
