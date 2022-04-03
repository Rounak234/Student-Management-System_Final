package com.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.model.Student;

@Service

public interface StudentService {
	
	List<Student> getAllStudents();
	
	

}
