package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.dao.StudentDAO;
import com.luv2code.springdemo.entity.Student;

@Repository
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDAO studentDAO;
	@Override
	public List<Student> getAllStudents() {
		
		return studentDAO.getAllStudents();
	}

	@Override
	public Student getAStudent(int id) {
		
		return studentDAO.getAStudent(id);
	}

	@Override
	public Student updateStudent(String id, Student student) {
		
		return studentDAO.updateStudent(id, student);
	}

	@Override
	public void deleteStudent(int id) {
		 studentDAO.deleteStudent(id);

	}

	@Override
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}

	@Override
	public Student getByName(String name) {
		
		return studentDAO.getByName(name);
	}

}
