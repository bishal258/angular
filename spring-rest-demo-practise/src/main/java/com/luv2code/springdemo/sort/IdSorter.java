package com.luv2code.springdemo.sort;

import java.util.Comparator;

import com.luv2code.springdemo.entity.Student;

public class IdSorter implements Comparator<Student> {



	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getId() - (o2.getId());
	}

}
