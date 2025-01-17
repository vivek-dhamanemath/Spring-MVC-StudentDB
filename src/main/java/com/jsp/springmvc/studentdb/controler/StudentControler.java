package com.jsp.springmvc.studentdb.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springmvc.studentdb.entity.Student;
import com.jsp.springmvc.studentdb.service.StudentService;

@Controller
public class StudentControler {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/add-student" , method = RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		return studentService.addStudent(student);
	}
	
	

}
