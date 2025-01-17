package com.jsp.springmvc.studentdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springmvc.studentdb.entity.Student;
import com.jsp.springmvc.studentdb.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public ModelAndView addStudent(Student student) {

		//Processing Request - saving the student info
		studentRepository.addStudnet(student);

		//Response - return back to dashboard
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		
		return mav;
	}
}
