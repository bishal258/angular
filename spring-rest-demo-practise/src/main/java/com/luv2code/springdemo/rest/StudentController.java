package com.luv2code.springdemo.rest;

import java.util.List;

import javax.annotation.Generated;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import javax.xml.ws.http.HTTPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.luv2code.springdemo.entity.Student;
import com.luv2code.springdemo.service.StudentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> showStudets(){
		List<Student> student = studentService.getAllStudents();
		return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> showStudent(@PathVariable int id) {
		Student student = studentService.getAStudent(id);
		if(student == null) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		
		}
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
	}
	
	@PostMapping("/student")
	public ResponseEntity<Student> postStudent(@RequestBody Student student){
		
		
			studentService.saveStudent(student);
		
		
		return new ResponseEntity<Student>(HttpStatus.CREATED);
		
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Student> updatetudent(@PathVariable String id,  @RequestBody Student student) {
		
		Student updateStudent = studentService.updateStudent(id, student);
		return new ResponseEntity<Student>(updateStudent, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<Student> deletestudent(@PathVariable int id) {
		
		studentService.deleteStudent(id);
		return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
		
	}

}
