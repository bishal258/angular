package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Student;
import com.luv2code.springdemo.service.StudentService;

@Controller
@RequestMapping("/students")
public class Test {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("/showStudents")
	public String showStudens(Model model) {
		//add to the list
		List<Student> students = studentService.getAllStudents();
		
		model.addAttribute("student", students);
		
		
		return "show-Student";
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "form";
	}
	
	
	@RequestMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student studen) {
		
		studentService.saveStudent(studen);
		
		return "confirmation";
	}
	
	@RequestMapping("/updateForm")
	public String showUpdateForm(Model model) {
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		 
		return "update";
	}
	
	@RequestMapping("/showStudent")
	public String showUpdateForm(@RequestParam("firstName") String name, Model model) {
		
		
		Student stu = studentService.getByName(name);
		
		
		model.addAttribute("student", stu);
		 
		return "showStudent";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student student, Model model) {
		
		
		
		Student stud = studentService.updateStudent(student.getFirstName(), student);
		
		model.addAttribute("student", stud);
		
		return "redirect://students/showStudents";
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("customerID") int id) {
		studentService.deleteStudent(id);
		return "redirect://students/showStudents";
		
	}
}
