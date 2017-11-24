package com.m24.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m24.demo.entity.Student;
import com.m24.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService service;
	
	@RequestMapping("query/{id}")
	public Student queryById(@PathVariable long id) {
		return service.queryById(id);
	}

	@RequestMapping("/queryAll/{offset}/{limit}")
	public List<Student> queryAll(@PathVariable int offset, @PathVariable int limit) {
		return service.queryAll(offset, limit);
	}

	@RequestMapping("/add/{student}")
	public void addStudent(@PathVariable Student student) {
		service.addStudent(student);
	}
}
