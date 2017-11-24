package com.m24.springcloud.service;

import java.util.List;

import com.m24.springcloud.entity.Student;

public interface StudentService {
	
	Student findByStudentId(long id);

	List<Student> findAll(int offset, int limit);
   
	void save(Student student);
	
}
