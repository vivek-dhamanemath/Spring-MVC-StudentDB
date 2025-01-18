package com.jsp.springmvc.studentdb.service;

import java.util.List;

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

	public ModelAndView displayAllStudents() {
		//Processing request - find all student details from db
		List<Student> students = studentRepository.findAll();

		//Response - sent  the Studentlist to display page
		ModelAndView mav = new ModelAndView();
		mav.setViewName("displayAllStudents.jsp");
		mav.addObject("studentList", students);


		return mav;
	}
}
