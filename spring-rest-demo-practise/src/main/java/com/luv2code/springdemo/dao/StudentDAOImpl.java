package com.luv2code.springdemo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Address;
import com.luv2code.springdemo.entity.Student;
import com.luv2code.springdemo.sort.IdSorter;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	private static List<Student> student = new ArrayList<Student>();
	
	
	@PostConstruct
	public List<Student> populate(){
	student.add(new Student(1, "Bishal", "Thapa"));
	student.add(new Student(2, "Bimal", "Thapa"));
	student.add(new Student(3, "Beema", "Thapa"));
	student.add(new Student(4, "Maya", "Thapa"));
	student.add(new Student(5, "Rit", "Thapa"));
	
	student.sort(new IdSorter());
	
	return student;
	
	}

	@Override
	public List<Student> getAllStudents() {
	
		return student;
	}

	@Override
	public Student getAStudent(int id) {
		for(Student student : student) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		for(Iterator<Student> iterator = student.iterator(); iterator.hasNext();) {
			Student student = iterator.next();
			if(student.getId() == id) {
				iterator.remove();
			}
		}

	}

	@Override
	public Student updateStudent(String id, Student student) {
		Student studentUpdate = getByName(id);
		if(studentUpdate != null) {
			studentUpdate.setId(student.getId());
			studentUpdate.setFirstName(student.getFirstName());
			studentUpdate.setLastName(student.getLastName());
		}
		return studentUpdate;
	}

	@Override
	public void saveStudent(Student students) {
		student.add(students);
		
	}
	
	@Override
	public Student getByName(String name) {
		for(Student stu : student) {
			if(stu.getFirstName().equalsIgnoreCase(name)) {
				return stu;
			}
		}
		return null;
	}
	
}
