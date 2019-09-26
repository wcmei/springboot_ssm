package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.study.springboot.entity.Student;
import com.study.springboot.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/insert")
	@ResponseStatus(value = HttpStatus.OK)
	public void insertStudent() {
		Student student = new Student("小小万",23,93.5);
		studentService.insertStudent(student);
	}
}
