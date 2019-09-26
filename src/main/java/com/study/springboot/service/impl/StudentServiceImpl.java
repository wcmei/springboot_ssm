package com.study.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dao.StudentMapper;
import com.study.springboot.entity.Student;
import com.study.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public void insertStudent(Student student) {
		studentMapper.insertStudent(student);
	}

}
