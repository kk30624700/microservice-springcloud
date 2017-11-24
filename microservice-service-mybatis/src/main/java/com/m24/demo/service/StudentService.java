package com.m24.demo.service;

import java.util.List;

import com.m24.demo.entity.Student;

public interface StudentService {
	
	Student queryById(long id);

	List<Student> queryAll(int offset, int limit);
   
	void addStudent(Student student);
	
}
