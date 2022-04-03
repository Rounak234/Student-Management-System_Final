package com.sms.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.model.Student;
import com.sms.repository.StudentRepository;
import com.sms.service.StudentService;

@Service

public class StudentServiceimpl implements StudentService{
	
	
	private StudentRepository studentRepository;

	public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
