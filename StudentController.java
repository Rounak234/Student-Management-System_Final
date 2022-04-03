package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.sms.service.StudentService;

@Controller
@Component
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//handler method to handle list students and returns mode and view
	@GetMapping("/students")
	
	public String listStudents(Model model){
		model.addAttribute("students",studentService.getAllStudents());
		return "students";
	
	}
	
}
